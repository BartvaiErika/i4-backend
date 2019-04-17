package com.example.drhousehospitalaccountancy.endpoints;

import com.example.mytodolist_week9.communication.ToDosClient;
import com.example.mytodolist_week9.persistance.ToDo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class InvoicesController {

    private List<Invoice> invoices = new ArrayList<>();
    private final AccountantClient client;

    @ModelAttribute("invoices")
    List<Invoice> invoices() {
        return invoices;
    }

    @ModelAttribute("invoice")
    Invoice invoice() {
        return new Invoice();
    }

    @GetMapping
    String page() {
        return "invoices";
    }

    @PostMapping
    String post(Invoice invoice, BindingResult result) {
        if (result.hasErrors()) {
            return page();
        }
        client.send(invoice);
        return "redirect:/";
    }

    @PostMapping("/paid")
    String delete(@RequestParam int invoiceId) {
        Invoice invoice = invoices.get(invoiceId);
        invoice.setPaid(true);
        return "redirect:/";
    }
}

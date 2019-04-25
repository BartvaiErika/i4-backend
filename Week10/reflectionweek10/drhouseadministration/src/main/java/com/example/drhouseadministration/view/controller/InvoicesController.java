package com.example.drhouseadministration.view.controller;

import com.example.drhouseadministration.communication.AccountantClient;
import com.example.drhouseadministration.view.model.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/invoices")
@RequiredArgsConstructor
public class InvoicesController {

    private final AccountantClient client;

    @ModelAttribute("invoices")
    List<Invoice> invoices() {
        return client.getAll();
    }

    @GetMapping
    String page() {
        return "invoices";
    }

    @PostMapping("/paid")
    String delete(@RequestParam Long invoiceId) {
       client.setPaid(invoiceId);
        return "redirect:/invoices";
    }
}

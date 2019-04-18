package com.example.drhouse_admission.communication;

import com.example.drhouse_admission.domain.Patient;
import com.example.drhouse_admission.logic.Admission;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/invoices")
@RequiredArgsConstructor
public class AccountantClient {

  private final Accountancy accountancy;
  private final RestTemplate restTemplate;

  @Value("${accountancyclient.server.url}")
  private String url;

  @GetMapping
  public List<Invoice> getAllInvoices(){
    return accountancy.findAll();
  }

  @PostMapping
  public Invoice post(@RequestBody Invoice invoice) {
    accountancy.bookInvoicePaid(invoice.get(id));
    restTemplate.save(invoice);
    forwardBackToAccountancy(invoice);
    return invoice;
  }

  public void forwardBackToAccountancy(Invoice invoice) {
    restTemplate.postForObject(url, invoice, Invoice.class);
  }

}
package com.example.drhouseadministration.communication;

import com.example.drhouseadministration.view.model.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/invoices")
@RequiredArgsConstructor
public class AccountantClient {

  private final RestTemplate restTemplate;

  @Value("${accountancyclient.server.url}")
  private String url;

  public List<Invoice> getAll(){
    return Arrays.asList(restTemplate.getForObject(url, Invoice[].class));
  }

  public void setPaid(Long invoiceId) {
    restTemplate.put(url, invoiceId);
  }

}

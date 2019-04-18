package com.example.drhousehospitalaccountancy.repository;

import com.example.drhousehospitalaccountancy.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  InvoiceRepository extends JpaRepository<Invoice, Long> {
//    List<Invoice> findInvoiceToPatient (String name);
}

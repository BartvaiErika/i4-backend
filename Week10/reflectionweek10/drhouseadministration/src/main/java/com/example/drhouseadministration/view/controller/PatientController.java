package com.example.drhouseadministration.view.controller;

import com.example.drhouseadministration.communication.PatientClient;
import com.example.drhouseadministration.view.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class PatientController {

    private final PatientClient client;

    @ModelAttribute("patient")
    Patient Patient() {
        return new Patient();
    }

    @GetMapping
    String page() {
        return "patients";
    }

    @PostMapping
    String post(@Valid Patient patient, BindingResult result) {
        if (result.hasErrors()) {
            return page();
        }
        client.post(patient);
        return "redirect:/";
    }

}

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
public class PatientController {

    private List<Patient> patients = new ArrayList<>();
    private final PatientClient client;
    private final Admission admission;

    @ModelAttribute("patients")
    List<Patient> getPatients() {
        return patients;
    }

    @ModelAttribute("patient")
    Patient Patient() {
        return new Patient();
    }

    @GetMapping
    String page() {
        return "patients";
    }

    @PostMapping
    String post(Patient patient, BindingResult result) {
        if (result.hasErrors()) {
            return page();
        }
        client.send(patient);
        return "redirect:/";
    }

    @PostMapping("/add")
    Patient registerPatient(@RequestParam name, @@RequestParam symptoms) {
        Patient newRegisteredPatient = new Patient();

        return "redirect:/";
    }

    @PostMapping("/add")
    String delete(@RequestParam int patientId) {
        Patient patient = patients.get(patientId);
        return "redirect:/";
    }
}

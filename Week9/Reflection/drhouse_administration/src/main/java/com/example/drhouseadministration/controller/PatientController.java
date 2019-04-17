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
    String delete(@RequestParam int patientId) {
        Patient patient = patients.get(patientId);
       // toDo.setDone(false);
        return "redirect:/";
    }
}

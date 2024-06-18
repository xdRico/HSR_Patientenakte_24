package de.gruppe6.patientfilefrontend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.gruppe6.patientfilefrontend.model.PatientfileItem;
import de.gruppe6.patientfilefrontend.service.BackendService;

@RestController
public class PatientfileItemController {
    private BackendService backendService;

    public PatientfileItemController(BackendService backendService) {
        this.backendService = backendService;
    }

    @GetMapping("/items")
    public List<PatientfileItem> getPatientfileItems() {
        return backendService.getPatientfileItems();
    }

    @GetMapping("/create")
    public PatientfileItem createPatientfileItem() {
        return backendService.createPatientfileItem(new PatientfileItem("Test", "Test"));
    }
}

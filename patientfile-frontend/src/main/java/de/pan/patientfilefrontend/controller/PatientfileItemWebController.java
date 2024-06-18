package de.pan.patientfilefrontend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import de.pan.patientfilefrontend.model.PatientfileItem;
import de.pan.patientfilefrontend.service.BackendService;

@Controller
public class PatientfileItemWebController {
    private static final Logger log = LoggerFactory.getLogger(PatientfileItemWebController.class);

    private final BackendService backendService;

    public PatientfileItemWebController(BackendService backendService) {
        this.backendService = backendService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }

    @GetMapping("/patientfiles")
    public String patientfileItemList(Model model) {
        log.info("Received GET request on /patientfiles. Serving patientfileItems.html");
        model.addAttribute("patientfile", new PatientfileItem("", ""));
        model.addAttribute("patientfiles", backendService.getPatientfileItems());
        return "patientfileItems";
    }

    @PostMapping("/patientfiles")
    public String createPatientfileItem(Model model, @ModelAttribute("patientfile") PatientfileItem patientfileItem) {
        log.info("Received POST request on /patientfiles with patientfile(name: {}, description: {}", patientfileItem.getPatientfileItemName(), patientfileItem.getPatientfileItemDescription());
        backendService.createPatientfileItem(patientfileItem);
        log.info("Redirecting to /patientfiles");
        return "redirect:/patientfiles";
    }
}


package de.gruppe6.patientfilefrontend.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.gruppe6.patientfilefrontend.model.PatientfileItem;

@FeignClient(value = "backendService", url = "http://localhost:8080/")
public interface BackendService {
    @RequestMapping(method = RequestMethod.GET, value = "/patientfile")
    List<PatientfileItem> getPatientfileItems();

    @RequestMapping(method = RequestMethod.POST, value = "/patientfile")
    PatientfileItem createPatientfileItem(@RequestBody PatientfileItem patientfileItem);
}

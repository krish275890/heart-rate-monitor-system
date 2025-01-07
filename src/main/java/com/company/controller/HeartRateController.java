package com.company.controller;

import com.company.model.HeartRate;
import com.company.service.HeartRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.company.model.Patient;

import java.util.List;

@RestController
@RequestMapping("/api/patients/{patientId}/heartRate")
public class HeartRateController {

    @Autowired
    private HeartRateService heartRateService;

    @PostMapping
    public HeartRate recordHeartRate(@PathVariable Long patientId, @RequestBody HeartRate heartRate) {
        heartRate.setPatient(new Patient(patientId)); // Associate heart rate with the patient
        return heartRateService.recordHeartRate(heartRate);
    }

    @GetMapping
    public List<HeartRate> getHeartRateDetails(@PathVariable Long patientId) {
        return heartRateService.getHeartRateDetails(patientId);
    }
}

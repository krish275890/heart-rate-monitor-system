package com.company.service;

import com.company.model.Patient;
import com.company.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient getPatientDetails(Long patientId) {
        return patientRepository.findById(patientId).orElse(null);
    }
}

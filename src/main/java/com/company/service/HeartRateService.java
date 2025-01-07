package com.company.service;

import com.company.model.HeartRate;
import com.company.repository.HeartRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeartRateService {

    @Autowired
    private HeartRateRepository heartRateRepository;

    public HeartRate recordHeartRate(HeartRate heartRate) {
        return heartRateRepository.save(heartRate);
    }

    public List<HeartRate> getHeartRateDetails(Long patientId) {
        return heartRateRepository.findByPatientId(patientId);
    }
}

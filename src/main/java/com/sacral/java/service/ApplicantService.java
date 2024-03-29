package com.sacral.java.service;

import com.sacral.java.model.Applicant;
import com.sacral.java.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {
    private final ApplicantRepository applicantRepository;

    @Autowired
    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public Applicant findHighLimitEligibleApplicant() {
        return applicantRepository.findHighLimitEligibleApplicant();
    }

    public Applicant findModerateLimitEligibleApplicant() {
        return applicantRepository.findModerateLimitEligibleApplicant();
    }

    // Additional methods for debt-to-income ratio calculation and pre-qualification status update can be added here

}
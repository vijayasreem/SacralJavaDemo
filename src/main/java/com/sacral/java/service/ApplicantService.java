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

    public Applicant findHighCreditScoreEligibleApplicant() {
        return applicantRepository.findHighCreditScoreEligibleApplicant();
    }

    public Applicant findModerateCreditScoreEligibleApplicant() {
        return applicantRepository.findModerateCreditScoreEligibleApplicant();
    }

    // You can add additional methods and business logic as per your requirements

}
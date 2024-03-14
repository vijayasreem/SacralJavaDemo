package com.sacral.java.controller;

import com.sacral.java.model.Applicant;
import com.sacral.java.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applicants")
public class ApplicantController {
    
    private final ApplicantService applicantService;
    
    @Autowired
    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }
    
    @GetMapping("/high-limit")
    public Applicant findHighLimitEligibleApplicant() {
        return applicantService.findHighLimitEligibleApplicant();
    }
    
    @GetMapping("/moderate-limit")
    public Applicant findModerateLimitEligibleApplicant() {
        return applicantService.findModerateLimitEligibleApplicant();
    }
    
    // Additional methods for debt-to-income ratio calculation and pre-qualification status update can be added here
    
}
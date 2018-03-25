package com.sih.msde.divergents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.service.GovDashboardService;

@RestController
public class GovDashboardController {

    @Autowired
    private GovDashboardService govDashboardService;

    @RequestMapping("/getTotalTrainingCenters")
    public Integer getTotalTrainingCenters() {
    	return govDashboardService.getTotalTrainingCenters();
    }
    
    @RequestMapping("/getTotalCandidatesPlaced")
    public Integer getTotalCandidatesPlaced()
    {
    	return govDashboardService.getTotalCandidatesPlaced();
    }
    
}
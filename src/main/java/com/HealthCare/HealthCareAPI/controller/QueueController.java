package com.HealthCare.HealthCareAPI.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/queue")
@SuppressWarnings("unused")
public class QueueController {

    @GetMapping("/live-status")
    public Map<String, Object> getQueueAnalytics() {
        Map<String, Object> response = new LinkedHashMap<>();

        int totalPatients = 15;
        int currentToken = 4;
        int averageServiceTime = 10; // minutes per patient

        int waitingPatients = totalPatients - currentToken;
        int estimatedWaitTime = waitingPatients * averageServiceTime;

        response.put("hospitalName", "Smart Health Care Center");
        response.put("totalWaiting", waitingPatients);
        response.put("yourTokenNumber", totalPatients + 1);
        response.put("estimatedWaitTimeMinutes", estimatedWaitTime);
        response.put("queueDensity", (waitingPatients > 10) ? "High" : "Normal");

        return response;
    }
}
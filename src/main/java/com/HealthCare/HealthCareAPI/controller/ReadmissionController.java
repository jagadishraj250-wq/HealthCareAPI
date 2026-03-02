package com.HealthCare.HealthCareAPI.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/predict")
@SuppressWarnings("unused")
public class ReadmissionController {

    @GetMapping("/readmission-probability")
    public Map<String, Object> getPrediction(@RequestParam String history) {
        Map<String, Object> response = new LinkedHashMap<>();

        double probability = history.equalsIgnoreCase("chronic") ? 78.5 : 12.2;

        response.put("predictionModel", "Healthcare-AI-v1");
        response.put("patientHistoryType", history);
        response.put("readmissionProbability", probability + "%");
        response.put("suggestion", probability > 50 ? "Recommend 48-hour observation" : "Follow-up in 1 week");

        return response;
    }
}
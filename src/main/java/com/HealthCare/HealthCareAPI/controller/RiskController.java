package com.HealthCare.HealthCareAPI.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/risk")
@SuppressWarnings("unused")
public class RiskController {

    @GetMapping("/calculate-score")
    public Map<String, Object> calculateRisk(@RequestParam int age, @RequestParam int bpm) {
        Map<String, Object> response = new LinkedHashMap<>();
        String riskLevel;
        String colorCode;

        if (age > 60 || bpm > 100) {
            riskLevel = "CRITICAL";
            colorCode = "RED";
        } else if (age > 45) {
            riskLevel = "MODERATE";
            colorCode = "YELLOW";
        } else {
            riskLevel = "NORMAL";
            colorCode = "GREEN";
        }

        response.put("patientAge", age);
        response.put("heartRate", bpm);
        response.put("calculatedRisk", riskLevel);
        response.put("uiColorCode", colorCode);
        response.put("message", "Health analysis completed based on vitals.");

        return response;
    }
}
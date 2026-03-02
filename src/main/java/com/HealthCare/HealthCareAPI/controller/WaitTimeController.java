package com.HealthCare.HealthCareAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/wait-time")
@SuppressWarnings("unused")
public class WaitTimeController {

    @GetMapping("/calculate")
    public Map<String, Object> calculateWaitTime(@RequestParam int position) {
        Map<String, Object> response = new LinkedHashMap<>();

        // Oka patient ki average ga 12 minutes padutundi ani logic
        int averageConsultationTime = 12;
        int totalWaitTime = position * averageConsultationTime;

        response.put("status", "Success");
        response.put("yourQueuePosition", position);
        response.put("estimatedWaitMinutes", totalWaitTime);
        response.put("message", "Please report to the reception 5 minutes before your time.");

        return response;
    }
}
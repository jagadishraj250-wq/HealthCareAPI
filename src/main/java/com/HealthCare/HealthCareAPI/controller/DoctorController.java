package com.HealthCare.HealthCareAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/doctor")
@SuppressWarnings("unused")
public class DoctorController {

    @GetMapping("/suggest")
    public Map<String, Object> suggestDoctor(@RequestParam String symptoms) {
        String lowerSymptoms = symptoms.toLowerCase();
        Map<String, Object> response = new LinkedHashMap<>();

        String doctorType;
        String department;

        if (lowerSymptoms.contains("heart") || lowerSymptoms.contains("chest")) {
            doctorType = "Dr. Arjun (Senior Cardiologist)";
            department = "Cardiology";
        } else if (lowerSymptoms.contains("fever") || lowerSymptoms.contains("cold")) {
            doctorType = "Dr. Vikas (General Physician)";
            department = "General Medicine";
        } else if (lowerSymptoms.contains("bone") || lowerSymptoms.contains("pain")) {
            doctorType = "Dr. Sneha (Orthopedic)";
            department = "Orthopedics";
        } else {
            doctorType = "General Consultant";
            department = "OPD";
        }

        response.put("status", "Success");
        response.put("inputSymptoms", symptoms);
        response.put("suggestedSpecialist", doctorType);
        response.put("department", department);

        return response;
    }
}
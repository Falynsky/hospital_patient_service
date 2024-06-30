package com.falynsky.hospital_patient_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getPrescriptions(@RequestHeader("Authorization") String token, @PathVariable String id) {
        return ResponseEntity.ok("String");
    }
}

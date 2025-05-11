package com.chronix.BookingScheduler.controllers;

import com.chronix.BookingScheduler.services.impl.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(path = "/api")
@RestController
public class HealthController {
    @Autowired
    HealthService healthService;
    @GetMapping(path = "/status")
     String getHealth() {
        return healthService.getHealthStatus();
    }
}

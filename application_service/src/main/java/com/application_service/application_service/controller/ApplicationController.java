package com.application_service.application_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/application-service")

public class ApplicationController {
    @GetMapping("/test")

    public String testEndpoint() {
        return "Hello from Application Service!";
    }
}



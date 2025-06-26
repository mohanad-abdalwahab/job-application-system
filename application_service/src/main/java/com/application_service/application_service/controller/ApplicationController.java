package com.application_service.application_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/application")

public class ApplicationController {
    @GetMapping("/application")

    public String home() {
        return "Welcome to Application Service Root!";
    }
}


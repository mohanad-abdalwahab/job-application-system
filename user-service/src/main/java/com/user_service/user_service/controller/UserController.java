package com.user_service.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "✅ User Service is Working!";
    }
}

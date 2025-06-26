package com.userservice;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${custom.message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}
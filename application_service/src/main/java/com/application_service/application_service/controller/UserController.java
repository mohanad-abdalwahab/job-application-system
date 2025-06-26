package com.application_service.application_service.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private static List<Map<String, String>> users = new ArrayList<>();

    static {
        Map<String, String> user1 = new HashMap<>();
        user1.put("id", "1");
        user1.put("name", "Alice");
        users.add(user1);

        Map<String, String> user2 = new HashMap<>();
        user2.put("id", "2");
        user2.put("name", "Bob");
        users.add(user2);
    }

    @GetMapping
    public List<Map<String, String>> getAllUsers() {
        return users;
    }

    @GetMapping("/{id}")
    public Map<String, String> getUserById(@PathVariable String id) {
        return users.stream()
                .filter(user -> user.get("id").equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @PostMapping
    public Map<String, String> createUser(@RequestBody Map<String, String> user) {
        users.add(user);
        return user;
    }
}

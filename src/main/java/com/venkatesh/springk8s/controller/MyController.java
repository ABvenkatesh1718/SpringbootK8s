package com.venkatesh.springk8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.UUID;

@RestController
public class MyController {

    private final String uniquePodId = UUID.randomUUID().toString().substring(0, 5);

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to Spring Boot with Kubernetes! + V1 From "+ uniquePodId;
    }

    @GetMapping("/welcome")
    public String getWelcomeUser(@RequestParam("user") String user) {
        return "Welcome "+user+" to Spring Boot with Kubernetes! + V1 From "+ uniquePodId;
    }

}

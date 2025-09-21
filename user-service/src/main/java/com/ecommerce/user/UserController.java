package com.ecommerce.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/health")
    public String health() {
        return "User Service is running!";
    }

    @GetMapping("/users")
    public String getUsers() {
        return "List of users from User Service";
    }
}
package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // POST /auth/register
    @PostMapping("/register")
    public User register(
            @RequestBody User user,
            @RequestParam String role) {
        return userService.registerUser(user, role);
    }

    // POST /auth/login (dummy login)
    @PostMapping("/login")
    public String login() {
        return "Login successful (security disabled)";
    }
}

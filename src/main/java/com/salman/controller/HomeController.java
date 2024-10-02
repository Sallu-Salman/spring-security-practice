package com.salman.controller;

import com.salman.entity.User;
import com.salman.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/test")
    public String testMethod() {
//        User user = new User();
//        user.setEmail("salman@test.com");
//        user.setEnabled(true);
//        user.setRole("ADMIN");
//        user.setPassword(passwordEncoder.encode("salman123"));
//
//        userRepository.save(user);
        return "Hello world";
    }

    @PostMapping("/test")
    public String testPostMethod() {
        return "POST: Hello world!";
    }

    @GetMapping("/register")
    public String registerUser() {
        return "Registered!";
    }
}

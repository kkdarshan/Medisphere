package com.medisphere.controller;

import com.medisphere.model.Registration;
import com.medisphere.service.RegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    private final RegistrationService service;

    public RegistrationController(RegistrationService service) {
        this.service = service;
    }

    // ✅ Default Home Page → Registration
    @GetMapping("/registration")
    public String showRegistrationPage(Model model) {
        model.addAttribute("registrations", service.getAllRegistrations());
        return "registration";  // registration.html page
    }

    // ✅ Handle Registration Submission
    @PostMapping("/register")
    public String registerUser(@ModelAttribute Registration registration, Model model) {
        service.saveRegistration(registration);
        model.addAttribute("success", "🎉 Registration successful! Welcome to Medisphere!");
        return "redirect:/home";  // Redirect to dashboard
    }

    // ✅ Dashboard Page (after registration)
    @GetMapping("/home")
    public String home() {
        return "home"; // your existing dashboard/home.html
    }
}
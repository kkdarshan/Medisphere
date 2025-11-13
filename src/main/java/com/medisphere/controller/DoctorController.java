package com.medisphere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {

    @GetMapping("/doctors")
    public String showDoctorsPage() {
        return "doctors"; // renders doctors.html
    }
}

package com.medisphere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /*@GetMapping("/doctors")
    public String doctors() {
        return "doctors";
    } */

   /* @GetMapping("/appointments")
    public String appointments() {
        return "appointments";
    } */

    /*@GetMapping("/medicines")
    public String medicines() {
        return "medicines";
    }*/

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/registration";
    }
}
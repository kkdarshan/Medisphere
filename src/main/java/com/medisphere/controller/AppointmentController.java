package com.medisphere.controller;

import com.medisphere.model.Appointment;
import com.medisphere.repository.AppointmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentRepository appointmentRepository;

    public AppointmentController(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    // ✅ Show appointment form for doctor ID
    @GetMapping("/book/{doctorId}")
    public String showBookingForm(@PathVariable Long doctorId, Model model) {
        model.addAttribute("doctorId", doctorId);
        model.addAttribute("appointment", new Appointment());
        return "appointment-form";
    }

    // ✅ Handle booking form submission
    @PostMapping("/book")
    public String bookAppointment(
            @RequestParam String patientName,
            @RequestParam String patientEmail,
            @RequestParam Long doctorId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime appointmentDateTime,
            RedirectAttributes redirectAttributes
    ) {
        Appointment ap = new Appointment();
        ap.setPatientName(patientName);
        ap.setPatientEmail(patientEmail);
        ap.setDoctorName("Doctor " + doctorId); // You can replace this later with actual doctor names
        ap.setAppointmentDateTime(appointmentDateTime);
        ap.setStatus("Scheduled");

        appointmentRepository.save(ap);
        redirectAttributes.addFlashAttribute("success", "✅ Appointment booked successfully!");
        return "redirect:/appointments";
    }

    // ✅ Show all appointments with dynamic status
    @GetMapping
    public String listAppointments(Model model) {
        List<Appointment> allAppointments = appointmentRepository.findAll();

        // ✅ Automatically update status based on time
        for (Appointment ap : allAppointments) {
            if (ap.getAppointmentDateTime().isBefore(LocalDateTime.now())) {
                ap.setStatus("Closed");
            } else {
                ap.setStatus("Scheduled");
            }
        }

        model.addAttribute("appointments", allAppointments);
        return "appointments";
    }
}
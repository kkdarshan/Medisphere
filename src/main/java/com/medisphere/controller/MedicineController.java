package com.medisphere.controller;

import com.medisphere.model.Medicine;
import com.medisphere.repository.MedicineRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/medicines")
public class MedicineController {

    private final MedicineRepository medicineRepository;

    public MedicineController(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    // ✅ Display all medicines in the database
    @GetMapping
    public String showAllMedicines(Model model) {
        model.addAttribute("medicines", medicineRepository.findAll());
        return "medicines";
    }

    // ✅ Show advisor page where user can enter diagnosis
    @GetMapping("/advisor")
    public String showAdvisorPage() {
        return "medicine-advisor";
    }

    // ✅ Suggest medicines based on entered diagnosis
    @GetMapping("/advise")
    public String suggestMedicines(@RequestParam String diagnosis, Model model) {
        List<Medicine> all = medicineRepository.findAll();

        // Create a final lowercase version for safe use in lambda
        final String inputDiagnosis = diagnosis.toLowerCase();

        List<Medicine> suggestions = all.stream()
                .filter(m ->
                        (inputDiagnosis.contains("fever") && m.getName().toLowerCase().contains("paracetamol")) ||
                        (inputDiagnosis.contains("cold") && m.getName().toLowerCase().contains("cetirizine")) ||
                        (inputDiagnosis.contains("headache") && m.getName().toLowerCase().contains("ibuprofen")) ||
                        (inputDiagnosis.contains("infection") && m.getName().toLowerCase().contains("amoxicillin")) ||
                        (inputDiagnosis.contains("pain") && m.getName().toLowerCase().contains("diclofenac")) ||
                        (inputDiagnosis.contains("cough") && m.getName().toLowerCase().contains("benadryl"))
                )
                .toList();

        if (suggestions.isEmpty()) {
            model.addAttribute("message", "⚠ No specific medicines found for '" + diagnosis + "'. Please consult a doctor.");
        } else {
            model.addAttribute("medicines", suggestions);
        }

        model.addAttribute("diagnosis", diagnosis);
        return "medicine-advisor";
    }
}
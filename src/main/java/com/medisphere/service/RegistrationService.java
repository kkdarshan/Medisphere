package com.medisphere.service;

import com.medisphere.model.Registration;
import com.medisphere.repository.RegistrationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    private final RegistrationRepository repository;

    public RegistrationService(RegistrationRepository repository) {
        this.repository = repository;
    }

    // ✅ Get all registered users
    public List<Registration> getAllRegistrations() {
        return repository.findAll();
    }

    // ✅ Save new registration
    public Registration saveRegistration(Registration registration) {
        return repository.save(registration);
    }

    // ✅ Delete user by ID
    public void deleteRegistration(Long id) {
        repository.deleteById(id);
    }
}
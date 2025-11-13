package com.medisphere.repository;

import com.medisphere.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    Registration findByEmail(String email);
}

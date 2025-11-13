package com.medisphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.medisphere.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

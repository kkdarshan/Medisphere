package com.medisphere.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;

import com.medisphere.model.User;
import com.medisphere.repository.UserRepository;

/*@Configuration
public class DataInitializer {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository) {
        return args -> {
            if (userRepository.count() == 0) {
                User admin = new User("admin", passwordEncoder.encode("admin123"), "ADMIN");
                userRepository.save(admin);
                System.out.println("✅ Default admin user created — username: admin, password: admin123");
            }
        };
    }
} */

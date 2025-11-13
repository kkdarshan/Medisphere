package com.medisphere.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // ✅ Completely disable login, CSRF, and any authentication
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // allow all pages without login
            )
            .formLogin(login -> login.disable())
            .httpBasic(basic -> basic.disable())
            .logout(logout -> logout.logoutSuccessUrl("/register").permitAll()); // Optional: redirect logout to registration page

        return http.build();
    }
}

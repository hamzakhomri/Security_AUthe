package com.AUth.Security_AUthe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;
//https://www.youtube.com/watch?v=us0VjFiHogo&ab_channel=DanVega
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeRequests(auth ->
                        auth.requestMatchers("/").permitAll() // Permit all requests to "/"
                                .anyRequest().authenticated()     // Require authentication for any other requests
                )
                .oauth2Login(withDefaults())            // Configure OAuth2 login with default settings
                .formLogin(withDefaults())              // Configure form-based login with default settings
                .build();                               // Build the SecurityFilterChain
    }

}

package com.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/books/add").hasRole("ADMIN")
                        .requestMatchers("/books/get/{bookId}").authenticated()
                        .requestMatchers("/books/search/{bookTitle}").hasRole("STUDENT")
                        .requestMatchers("/books/all").permitAll()
                )
                .formLogin(Customizer.withDefaults());
        return httpSecurity.build();
    }

}

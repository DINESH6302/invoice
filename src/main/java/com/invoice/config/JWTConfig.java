package com.invoice.config;

import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.StandardCharsets;
import java.security.Key;

@Configuration
public class JWTConfig {
    @Value("${security.jwt.secret}")
    private String secret;

    @Value("${security.jwt.access-ttl-minutes}")
    private long accessTtlMinutes;

    @Value("${security.jwt.refresh-ttl-days}")
    private long refreshTtlDays;

    @Bean
    public Key jwtSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }
}




















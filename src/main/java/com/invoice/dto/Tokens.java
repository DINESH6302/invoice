package com.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tokens {
    private String accessToken;
    private String refreshToken;
}

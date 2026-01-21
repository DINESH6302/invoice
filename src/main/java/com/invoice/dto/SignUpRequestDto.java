package com.invoice.dto;

import lombok.Data;

@Data
public class SignUpRequestDto {
    private String userName;
    private String password;
    private String email;
}

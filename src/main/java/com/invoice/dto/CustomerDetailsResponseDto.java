package com.invoice.dto;

import lombok.Data;

@Data
public class CustomerDetailsResponseDto {
    private Long customerId;
    private String customerName;
    private String gstNo;
    private AddressDto address;
}

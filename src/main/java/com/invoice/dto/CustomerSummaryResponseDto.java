package com.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerSummaryResponseDto {
    private Long customerId;
    private String customerName;
}

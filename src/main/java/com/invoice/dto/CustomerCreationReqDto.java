package com.invoice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CustomerCreationReqDto {

    @NotNull
    private String customerName;

    @NotNull
    private String gstNo;

    @NotNull
    private AddressDto address;
}

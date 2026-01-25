package com.invoice.dto;

import lombok.Data;

@Data
public class DefaultTemplateRequestDto {
    private Long templateId;
    private Boolean isDefault;
}

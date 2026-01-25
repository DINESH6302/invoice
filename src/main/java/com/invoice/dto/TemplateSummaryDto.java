package com.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class TemplateSummaryDto {
    private Long templateId;
    private Boolean isDefault;
    private String templateName;
    private Instant updatedAt;
}

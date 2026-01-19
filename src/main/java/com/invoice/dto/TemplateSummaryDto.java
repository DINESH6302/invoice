package com.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TemplateSummaryDto {
    private Long templateId;
    private String templateName;
    private Long updatedAt;
}

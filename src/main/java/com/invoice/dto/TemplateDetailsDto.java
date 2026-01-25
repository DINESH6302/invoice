package com.invoice.dto;

import lombok.Data;

import java.util.Map;

@Data
public class TemplateDetailsDto {
    private Long templateId;
    private String templateName;
    private String fontFamily;
    private Integer fontSize;
    private Boolean isDefault;
    private String accentColor;
    private Map<String, Object> header;
    private Map<String, Object> invoiceMeta;
    private Map<String, Object> customerDetails;
    private Map<String, Object> items;
    private Map<String, Object> total;
    private Map<String, Object> footer;
}

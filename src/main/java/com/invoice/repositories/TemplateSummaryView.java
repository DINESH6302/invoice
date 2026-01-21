package com.invoice.repositories;

import java.time.Instant;

public interface TemplateSummaryView {
    String getTemplateName();
    Long getTemplateId();
    Instant getUpdatedAt();
}

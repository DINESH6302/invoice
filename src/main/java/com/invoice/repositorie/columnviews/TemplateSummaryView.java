package com.invoice.repositorie.columnviews;

import java.time.Instant;

public interface TemplateSummaryView {
    String getTemplateName();
    Boolean getIsDefault();
    Long getTemplateId();
    Instant getUpdatedAt();
}

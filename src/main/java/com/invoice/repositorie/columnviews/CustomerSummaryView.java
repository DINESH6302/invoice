package com.invoice.repositorie.columnviews;

import lombok.Data;

public interface CustomerSummaryView {
    Long getCustomerId();
    String getCustomerName();
}

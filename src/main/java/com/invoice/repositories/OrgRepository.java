package com.invoice.repositories;

import com.invoice.models.Organization;
import com.invoice.repositories.columnviews.OrgSummaryView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrgRepository extends JpaRepository<Organization, Long> {
    Boolean existsByOrgName(String orgName);

    List<OrgSummaryView> findByUser_UserId(Long userId);
}

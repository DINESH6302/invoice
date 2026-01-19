package com.invoice.repositories;

import com.invoice.models.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Long> {

    List<TemplateSummary> findAllBy();

    Boolean existsByTemplateName(String templateName);
    Boolean existsByTemplateId(Long templateId);

    @Override
    void deleteById(Long templateId);

    //    List<Template> findByOrganizationOrgId(Long orgId);
//
//    Optional<Template> findByTemplateIdAndOrganizationOrgId(Long templateId, Long orgId);
//
//    boolean existsByTemplateNameAndOrganizationOrgId(String templateName, Long orgId);
}
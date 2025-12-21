package com.example.demo.service;

import com.example.demo.model.WorkflowTemplate;
import com.example.demo.repository.WorkflowTemplateRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WorkflowTemplateServiceImpl implements WorkflowTemplateService {

    private final WorkflowTemplateRepository repository;

    public WorkflowTemplateServiceImpl(WorkflowTemplateRepository repository) {
        this.repository = repository;
    }

    public WorkflowTemplate createTemplate(WorkflowTemplate t) {
        return repository.save(t);
    }

    public WorkflowTemplate getTemplateById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<WorkflowTemplate> getAllTemplates() {
        return repository.findAll();
    }

    public WorkflowTemplate updateTemplate(Long id, WorkflowTemplate t) {
        t.setId(id);
        return repository.save(t);
    }

    public WorkflowTemplate activateTemplate(Long id, boolean active) {
        WorkflowTemplate t = getTemplateById(id);
        t.setActive(active);
        return repository.save(t);
    }
}

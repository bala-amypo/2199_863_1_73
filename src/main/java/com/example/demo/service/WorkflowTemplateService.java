package com.example.demo.service;

import com.example.demo.model.WorkflowTemplate;
import com.example.demo.repository.WorkflowTemplateRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class WorkflowTemplateService {

    private final WorkflowTemplateRepository workflowTemplateRepository;

    public WorkflowTemplateService(WorkflowTemplateRepository workflowTemplateRepository) {
        this.workflowTemplateRepository = workflowTemplateRepository;
    }

    public WorkflowTemplate save(WorkflowTemplate template) {
        return workflowTemplateRepository.save(template);
    }

    public Optional<WorkflowTemplate> findById(Long id) {
        return workflowTemplateRepository.findById(id);
    }

    public List<WorkflowTemplate> findAll() {
        return workflowTemplateRepository.findAll();
    }
}
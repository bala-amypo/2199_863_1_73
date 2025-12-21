package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class WorkflowStepConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long templateId;   // IMPORTANT: no @ManyToOne
    private Integer levelNumber;
    private String approverRole;
    private Boolean isFinalStep;
    private String instructions;

    // Default constructor
    public WorkflowStepConfig() {
    }

    // Parameterized constructor
    public WorkflowStepConfig(Long id, Long templateId, Integer levelNumber, String approverRole, Boolean isFinalStep, String instructions) {
        this.id = id;
        this.templateId = templateId;
        this.levelNumber = levelNumber;
        this.approverRole = approverRole;
        this.isFinalStep = isFinalStep;
        this.instructions = instructions;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Integer getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(Integer levelNumber) {
        this.levelNumber = levelNumber;
    }

    public String getApproverRole() {
        return approverRole;
    }

    public void setApproverRole(String approverRole) {
        this.approverRole = approverRole;
    }

    public Boolean getIsFinalStep() {
        return isFinalStep;
    }

    public void setIsFinalStep(Boolean isFinalStep) {
        this.isFinalStep = isFinalStep;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}

package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "workflow_template", uniqueConstraints = @UniqueConstraint(columnNames = "templateName"))
public class WorkflowTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String templateName;
    private String description;
    private Integer totalLevels;
    private Boolean active;

    // getters and setters
}

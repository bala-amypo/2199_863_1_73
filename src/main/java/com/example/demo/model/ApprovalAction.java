package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ApprovalAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long requestId;
    private Long approverId;
    private Integer levelNumber;
    private String action;
    private String comments;
    private LocalDateTime actionDate = LocalDateTime.now();

    // getters and setters
}

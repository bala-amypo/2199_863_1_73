package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AuditLogRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long requestId;
    private String eventType;
    private String details;
    private LocalDateTime loggedAt = LocalDateTime.now();

    // getters and setters
}

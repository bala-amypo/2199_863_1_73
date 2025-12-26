package com.example.demo.service;

import com.example.demo.model.ApprovalRequest;
import com.example.demo.repository.ApprovalActionRepository;
import com.example.demo.repository.ApprovalRequestRepository;
import com.example.demo.repository.WorkflowStepConfigRepository;
import com.example.demo.repository.WorkflowTemplateRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ApprovalRequestService {

    private final ApprovalRequestRepository approvalRequestRepository;
    private final WorkflowStepConfigRepository workflowStepConfigRepository;
    private final WorkflowTemplateRepository workflowTemplateRepository;
    private final ApprovalActionRepository approvalActionRepository;

    public ApprovalRequestService(ApprovalRequestRepository approvalRequestRepository,
                                WorkflowStepConfigRepository workflowStepConfigRepository,
                                WorkflowTemplateRepository workflowTemplateRepository,
                                ApprovalActionRepository approvalActionRepository) {
        this.approvalRequestRepository = approvalRequestRepository;
        this.workflowStepConfigRepository = workflowStepConfigRepository;
        this.workflowTemplateRepository = workflowTemplateRepository;
        this.approvalActionRepository = approvalActionRepository;
    }

    public ApprovalRequest save(ApprovalRequest request) {
        if (request.getCreatedAt() == null) {
            request.setCreatedAt(LocalDateTime.now());
        }
        return approvalRequestRepository.save(request);
    }

    public List<ApprovalRequest> findAll() {
        return approvalRequestRepository.findAll();
    }
}
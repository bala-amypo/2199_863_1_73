package com.example.demo.service;

import com.example.demo.model.ApprovalRequest;
import com.example.demo.repository.ApprovalRequestRepository;
import com.example.demo.repository.WorkflowStepConfigRepository;
import com.example.demo.repository.WorkflowTemplateRepository;
import com.example.demo.repository.ApprovalActionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApprovalRequestServiceImpl implements ApprovalRequestService {

    public ApprovalRequestServiceImpl(
            ApprovalRequestRepository approvalRequestRepository,
            WorkflowStepConfigRepository workflowStepConfigRepository,
            WorkflowTemplateRepository workflowTemplateRepository,
            ApprovalActionRepository approvalActionRepository) {

        this.approvalRequestRepository = approvalRequestRepository;
    }

    private final ApprovalRequestRepository approvalRequestRepository;

    public ApprovalRequest createRequest(ApprovalRequest req) {
        return approvalRequestRepository.save(req);
    }

    public List<ApprovalRequest> getRequestsByRequester(Long userId) {
        return approvalRequestRepository.findByRequesterId(userId);
    }

    public List<ApprovalRequest> getAllRequests() {
        return approvalRequestRepository.findAll();
    }
}

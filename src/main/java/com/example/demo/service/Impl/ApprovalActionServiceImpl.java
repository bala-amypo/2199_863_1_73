package com.example.demo.service;

import com.example.demo.model.ApprovalAction;
import com.example.demo.repository.ApprovalActionRepository;
import com.example.demo.repository.ApprovalRequestRepository;
import org.springframework.stereotype.Service;

@Service
public class ApprovalActionServiceImpl implements ApprovalActionService {

    private final ApprovalActionRepository approvalActionRepository;

    public ApprovalActionServiceImpl(
            ApprovalActionRepository approvalActionRepository,
            ApprovalRequestRepository approvalRequestRepository) {
        this.approvalActionRepository = approvalActionRepository;
    }

    public ApprovalAction recordAction(ApprovalAction action) {
        return approvalActionRepository.save(action);
    }
}

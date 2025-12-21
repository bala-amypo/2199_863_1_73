package com.example.demo.controller;

import com.example.demo.model.ApprovalAction;
import com.example.demo.service.ApprovalActionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/actions")
public class ApprovalActionController {

    private final ApprovalActionService approvalActionService;

    public ApprovalActionController(ApprovalActionService approvalActionService) {
        this.approvalActionService = approvalActionService;
    }

    // POST /api/actions
    @PostMapping
    public ApprovalAction recordAction(@RequestBody ApprovalAction action) {
        return approvalActionService.recordAction(action);
    }
}

package com.example.demo.controller;

import com.example.demo.model.ApprovalRequest;
import com.example.demo.service.ApprovalRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class ApprovalRequestController {

    private final ApprovalRequestService approvalRequestService;

    public ApprovalRequestController(ApprovalRequestService approvalRequestService) {
        this.approvalRequestService = approvalRequestService;
    }

    // POST /api/requests
    @PostMapping
    public ApprovalRequest createRequest(@RequestBody ApprovalRequest request) {
        return approvalRequestService.createRequest(request);
    }

    // GET /api/requests
    @GetMapping
    public List<ApprovalRequest> getAllRequests() {
        return approvalRequestService.getAllRequests();
    }

    // GET /api/requests/requester/{userId}
    @GetMapping("/requester/{userId}")
    public List<ApprovalRequest> getRequestsByRequester(
            @PathVariable Long userId) {
        return approvalRequestService.getRequestsByRequester(userId);
    }
}

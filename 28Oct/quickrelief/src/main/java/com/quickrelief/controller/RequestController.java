//iN CONTROLLER WE 	Defines API endpoints
package com.quickrelief.controller;

import com.quickrelief.model.SupplyRequest;
import com.quickrelief.service.SupplyService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/requests")
public class RequestController {

    private final SupplyService supplyService;

    public RequestController(SupplyService supplyService) {
        this.supplyService = supplyService;
    }

    // POST /api/requests
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SupplyRequest createRequest(
            @RequestBody SupplyRequest request) {
        return supplyService.allocate(request);
    }
}

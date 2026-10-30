////iN CONTROLLER WE 	Defines API endpoints
package com.quickrelief.controller;

import com.quickrelief.model.Supply;
import com.quickrelief.service.SupplyService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplies")
public class SupplyController {

    private final SupplyService supplyService;

    public SupplyController(SupplyService supplyService) {
        this.supplyService = supplyService;
    }

    // GET /api/supplies
    @GetMapping
    public List<Supply> getAllSupplies() {
        return supplyService.getAllSupplies();
    }

    // POST /api/supplies
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Supply addSupply(@RequestBody Supply supply) {
        return supplyService.addOrRestock(supply);
    }
}

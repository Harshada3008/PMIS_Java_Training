
package com.quickrelief.service;

import com.quickrelief.model.Supply;
import com.quickrelief.model.SupplyRequest;
import com.quickrelief.repository.RequestRepository;
import com.quickrelief.repository.SupplyRepository;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SupplyService {

    private final SupplyRepository supplyRepository;
    private final RequestRepository requestRepository;

    public SupplyService(SupplyRepository supplyRepository,
                         RequestRepository requestRepository) {
        this.supplyRepository = supplyRepository;
        this.requestRepository = requestRepository;
    }

    // Add new supplies or restock existing supplies
    @Transactional
    public Supply addOrRestock(Supply supply) {

        if (supply.getItemName() == null
                || supply.getItemName().isBlank()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Item name is required"
            );
        }

        if (supply.getQuantity() <= 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Quantity must be positive"
            );
        }

        String itemName = supply.getItemName().trim();

        Supply existing = supplyRepository.findByName(itemName);

        if (existing == null) {
            supplyRepository.addSupply(itemName, supply.getQuantity());
        } else {
            supplyRepository.restock(itemName, supply.getQuantity());
        }

        return supplyRepository.findByName(itemName);
    }

    // View all available supplies
    public List<Supply> getAllSupplies() {
        return supplyRepository.findAll();
    }

    // Allocate supplies and record the request
    @Transactional
    public SupplyRequest allocate(SupplyRequest request) {

        if (request.getItemName() == null
                || request.getItemName().isBlank()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Item name is required"
            );
        }

        if (request.getRequestedBy() == null
                || request.getRequestedBy().isBlank()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Requested by is required"
            );
        }

        if (request.getQuantity() <= 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Quantity must be positive"
            );
        }

        String itemName = request.getItemName().trim();

        Supply supply = supplyRepository.findByName(itemName);

        if (supply == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Supply item not found"
            );
        }

        int updated = supplyRepository.deductIfAvailable(
                itemName,
                request.getQuantity()
        );

        if (updated == 0) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Insufficient stock available"
            );
        }

        SupplyRequest savedRequest = new SupplyRequest(
                null,
                supply.getItemName(),
                request.getQuantity(),
                "ALLOCATED",
                request.getRequestedBy().trim()
        );

        // Save the request and return it with its generated database ID
        return requestRepository.save(savedRequest);
    }
}

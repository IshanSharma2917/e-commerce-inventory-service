package com.inventory.inventory_service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.inventory_service.dto.InventoryResponse;
import com.inventory.inventory_service.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {

        return inventoryService.isInstock(skuCode);
    }
}

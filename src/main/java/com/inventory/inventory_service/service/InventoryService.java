package com.inventory.inventory_service.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventory.inventory_service.dto.InventoryResponse;
import com.inventory.inventory_service.repository.InventoryRepository;



@Service
public class InventoryService {

	private final InventoryRepository inventoryRepository;

	public InventoryService(InventoryRepository inventoryRepository)
	{
		this.inventoryRepository=inventoryRepository;
	}

	@Transactional(readOnly = true)
	public List<InventoryResponse> isInstock(List<String> skucode) {

	    return inventoryRepository.findBySkucodeIn(skucode)
	            .stream()
	            .map(inventory ->
	                    new InventoryResponse(
	                            inventory.getSkucode(),
	                            inventory.getQuantity() > 0
	                    )
	            )
	            .toList();
	}

}

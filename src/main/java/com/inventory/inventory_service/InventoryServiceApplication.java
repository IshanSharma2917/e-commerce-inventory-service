package com.inventory.inventory_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.inventory.inventory_service.model.Inventory;
import com.inventory.inventory_service.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository)
	{
		return args -> {
			Inventory inventory= new Inventory();
			inventory.setSkucode("iphone 13");
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();
			inventory1.setSkucode("iphone 14");
			inventory1.setQuantity(109);


			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};

	}

}

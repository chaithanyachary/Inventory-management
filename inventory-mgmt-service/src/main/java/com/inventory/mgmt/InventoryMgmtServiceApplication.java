package com.inventory.mgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryMgmtServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryMgmtServiceApplication.class, args);
	}

}
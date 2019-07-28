package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.entity.InventoryItem;

@Repository
public interface ItemRepository extends JpaRepository<InventoryItem, String> {

}

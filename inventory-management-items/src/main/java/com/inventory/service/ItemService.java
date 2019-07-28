package com.inventory.service;

import java.util.List;

import com.inventory.entity.InventoryItem;

public interface ItemService
{
	public void createItem(InventoryItem inventoryItem);
	public List<InventoryItem> getAllItems();
}

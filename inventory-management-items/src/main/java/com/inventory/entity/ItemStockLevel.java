package com.inventory.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_stock_level")
public class ItemStockLevel {
	
	private String inventoryItemId;
	
	@Id
	private Date stockTakingDate;
	private int quantityInStock;

	public ItemStockLevel() {
	}

	public ItemStockLevel(String inventoryItemId, Date stockTakingDate, int quantityInStock) {
		super();
		this.inventoryItemId = inventoryItemId;
		this.stockTakingDate = stockTakingDate;
		this.quantityInStock = quantityInStock;
	}

	public String getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(String inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public Date getStockTakingDate() {
		return stockTakingDate;
	}

	public void setStockTakingDate(Date stockTakingDate) {
		this.stockTakingDate = stockTakingDate;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	@Override
	public String toString() {
		return "ItemStockLevel [inventoryItemId=" + inventoryItemId + ", stockTakingDate=" + stockTakingDate
				+ ", quantityInStock=" + quantityInStock + "]";
	}

	

}

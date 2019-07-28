package com.inventory.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ref_item_category")
public class RefItemCategory 
{
	@Id
	private String itemCategoryCode;
	private String itemCategoryDescription;

	public RefItemCategory() {}

	public String getItemCategoryCode() {
		return itemCategoryCode;
	}

	public void setItemCategoryCode(String itemCategoryCode) {
		this.itemCategoryCode = itemCategoryCode;
	}

	public String getItemCategoryDescription() {
		return itemCategoryDescription;
	}

	public void setItemCategoryDescription(String itemCategoryDescription) {
		this.itemCategoryDescription = itemCategoryDescription;
	}

	public RefItemCategory(String itemCategoryCode, String itemCategoryDescription) {
		super();
		this.itemCategoryCode = itemCategoryCode;
		this.itemCategoryDescription = itemCategoryDescription;
	}

	@Override
	public String toString() {
		return "RefItemCategory [itemCategoryCode=" + itemCategoryCode + ", itemCategoryDescription="
				+ itemCategoryDescription + "]";
	}

}

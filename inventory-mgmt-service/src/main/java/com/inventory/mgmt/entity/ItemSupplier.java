/**
 * 
 */
package com.inventory.mgmt.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author ddharaniprag
 *
 */
@Entity
@Table(name = "item_supplier")
public class ItemSupplier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1740743014577323286L;

	@Id
	private String itemSupplierId;

	@JsonBackReference("supplier-item")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;

	private int valueSuppliedToDate;
	private int totalQuantitySuppliedToDate;
	private Date firstItemSuppliedDate;
	private Date lastItemSuppliedDate;
	private int deliveryLeadTime;
	private Double standardPrice;
	private Double percentageDiscount;
	private int minimumOrderQuantity;
	private int maximumOrderQuantity;

	/**
	 * Default constructor
	 */
	public ItemSupplier() {
	}

	public ItemSupplier(String itemSupplierId, Supplier supplier, int valueSuppliedToDate,
			int totalQuantitySuppliedToDate, Date firstItemSuppliedDate, Date lastItemSuppliedDate,
			int deliveryLeadTime, Double standardPrice, Double percentageDiscount, int minimumOrderQuantity,
			int maximumOrderQuantity) {
		super();
		this.itemSupplierId = itemSupplierId;
		this.supplier = supplier;
		this.valueSuppliedToDate = valueSuppliedToDate;
		this.totalQuantitySuppliedToDate = totalQuantitySuppliedToDate;
		this.firstItemSuppliedDate = firstItemSuppliedDate;
		this.lastItemSuppliedDate = lastItemSuppliedDate;
		this.deliveryLeadTime = deliveryLeadTime;
		this.standardPrice = standardPrice;
		this.percentageDiscount = percentageDiscount;
		this.minimumOrderQuantity = minimumOrderQuantity;
		this.maximumOrderQuantity = maximumOrderQuantity;
	}

	public String getItemSupplierId() {
		return itemSupplierId;
	}

	public void setItemSupplierId(String itemSupplierId) {
		this.itemSupplierId = itemSupplierId;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public int getValueSuppliedToDate() {
		return valueSuppliedToDate;
	}

	public void setValueSuppliedToDate(int valueSuppliedToDate) {
		this.valueSuppliedToDate = valueSuppliedToDate;
	}

	public int getTotalQuantitySuppliedToDate() {
		return totalQuantitySuppliedToDate;
	}

	public void setTotalQuantitySuppliedToDate(int totalQuantitySuppliedToDate) {
		this.totalQuantitySuppliedToDate = totalQuantitySuppliedToDate;
	}

	public Date getFirstItemSuppliedDate() {
		return firstItemSuppliedDate;
	}

	public void setFirstItemSuppliedDate(Date firstItemSuppliedDate) {
		this.firstItemSuppliedDate = firstItemSuppliedDate;
	}

	public Date getLastItemSuppliedDate() {
		return lastItemSuppliedDate;
	}

	public void setLastItemSuppliedDate(Date lastItemSuppliedDate) {
		this.lastItemSuppliedDate = lastItemSuppliedDate;
	}

	public int getDeliveryLeadTime() {
		return deliveryLeadTime;
	}

	public void setDeliveryLeadTime(int deliveryLeadTime) {
		this.deliveryLeadTime = deliveryLeadTime;
	}

	public Double getStandardPrice() {
		return standardPrice;
	}

	public void setStandardPrice(Double standardPrice) {
		this.standardPrice = standardPrice;
	}

	public Double getPercentageDiscount() {
		return percentageDiscount;
	}

	public void setPercentageDiscount(Double percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}

	public int getMinimumOrderQuantity() {
		return minimumOrderQuantity;
	}

	public void setMinimumOrderQuantity(int minimumOrderQuantity) {
		this.minimumOrderQuantity = minimumOrderQuantity;
	}

	public int getMaximumOrderQuantity() {
		return maximumOrderQuantity;
	}

	public void setMaximumOrderQuantity(int maximumOrderQuantity) {
		this.maximumOrderQuantity = maximumOrderQuantity;
	}

}

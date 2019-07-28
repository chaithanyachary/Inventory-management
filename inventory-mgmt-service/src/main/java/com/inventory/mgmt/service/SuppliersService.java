/**
 * 
 */
package com.inventory.mgmt.service;

import com.inventory.mgmt.entity.Supplier;

/**
 * @author ddharaniprag
 *
 */
public interface SuppliersService {

	public void createSupplier(Supplier supplier);

	public void updateSupplier(Supplier supplier);

	public void deleteSupplier(String supplierId);

	public Supplier findById(String supplierID);

}

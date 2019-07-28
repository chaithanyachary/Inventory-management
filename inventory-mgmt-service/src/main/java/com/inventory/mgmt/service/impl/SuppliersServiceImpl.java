package com.inventory.mgmt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.mgmt.entity.Supplier;
import com.inventory.mgmt.repository.SuppliersRepository;
import com.inventory.mgmt.service.SuppliersService;

@Service
public class SuppliersServiceImpl implements SuppliersService {

	@Autowired
	private SuppliersRepository suppliersRepository;

	@Override
	public void createSupplier(Supplier supplier) {
		this.suppliersRepository.saveAndFlush(supplier);
	}

	@Override
	public void updateSupplier(Supplier supplier) {
		this.suppliersRepository.saveAndFlush(supplier);
	}

	@Override
	public void deleteSupplier(String supplierID) {
		this.suppliersRepository.deleteById(supplierID);
	}

	@Override
	public Supplier findById(String supplierId) {
		Supplier tmpObj = new Supplier();
		tmpObj = this.suppliersRepository.getOne(supplierId);
		return tmpObj;
	}

}

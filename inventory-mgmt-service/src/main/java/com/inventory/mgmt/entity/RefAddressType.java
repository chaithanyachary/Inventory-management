/**
 * 
 */
package com.inventory.mgmt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ref_address_type")
public class RefAddressType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5305420861281709093L;

	@Id
	private String addressTypeCode;
	private String typeDescription;

	public RefAddressType() {
	}

	public RefAddressType(String addressTypeCode, String typeDescription) {
		super();
		this.addressTypeCode = addressTypeCode;
		this.typeDescription = typeDescription;
	}

	public String getAddressTypeCode() {
		return addressTypeCode;
	}

	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

}

package com.neebal.entity;

import javax.persistence.Embeddable;
import javax.persistence.Lob;

@Embeddable
public class Address {
	
	@Lob
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}

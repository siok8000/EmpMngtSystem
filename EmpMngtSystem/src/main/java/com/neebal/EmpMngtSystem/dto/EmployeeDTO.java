package com.neebal.EmpMngtSystem.dto;

import java.util.List;
import java.util.Set;

public class EmployeeDTO {
	
	private Long id;

	private String name;
	
	private List<AddressDTO> addresses;
	
	private Set<ContactDTO> contacts;
	
	private DepartmentDTO department;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AddressDTO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressDTO> addresses) {
		this.addresses = addresses;
	}

	public Set<ContactDTO> getContacts() {
		return contacts;
	}

	public void setContacts(Set<ContactDTO> contacts) {
		this.contacts = contacts;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}

}

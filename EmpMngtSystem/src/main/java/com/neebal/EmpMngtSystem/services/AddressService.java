package com.neebal.EmpMngtSystem.services;

import java.util.List;

import com.neebal.EmpMngtSystem.dto.AddressDTO;
import com.neebal.EmpMngtSystem.entities.Address;

public interface AddressService {
	
	List<Address> updateAddresses(List<AddressDTO> addressDTOs);

}

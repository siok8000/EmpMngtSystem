package com.neebal.EmpMngtSystem.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neebal.EmpMngtSystem.converter.Converter;
import com.neebal.EmpMngtSystem.dto.AddressDTO;
import com.neebal.EmpMngtSystem.entities.Address;
import com.neebal.EmpMngtSystem.repository.AddressRepository;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private Converter converter;
	
	@Override
	public List<Address> updateAddresses(List<AddressDTO> addressDTOs) {
		List<Address> addresses = new ArrayList<Address>();
		for (AddressDTO addressDTO : addressDTOs) {
			if (addressDTO.getId() != null) {
				Optional<Address> optionalAdd = addressRepository.findById(addressDTO.getId());
				if (optionalAdd.isPresent()) {
					Address address = optionalAdd.get();
					address.setAddress(addressDTO.getAddress());
					addresses.add(address);
				}
			}else {
				addresses.add(converter.convertAddDTOTOEntity(addressDTO));
			}
		}
		return addresses;
	}

}

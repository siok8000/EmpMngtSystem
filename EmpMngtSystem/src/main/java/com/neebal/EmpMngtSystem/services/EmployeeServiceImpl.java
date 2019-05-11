package com.neebal.EmpMngtSystem.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neebal.EmpMngtSystem.converter.Converter;
import com.neebal.EmpMngtSystem.dto.EmployeeDTO;
import com.neebal.EmpMngtSystem.entities.Employee;
import com.neebal.EmpMngtSystem.repository.EmployeeRepository;

@Service
//@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private Converter converter;
	
	@Override
	public List<EmployeeDTO> getEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		
		List<EmployeeDTO> employeeDTOs = new ArrayList<EmployeeDTO>();
		
		for (Employee employee : employees) {
			EmployeeDTO employeeDTO = converter.convertTOEmployeeDTO(employee);
			employeeDTOs.add(employeeDTO);
		}
		
		return employeeDTOs;
	}

	@Override
	public EmployeeDTO getEmployee(Long id) {
		EmployeeDTO employeeDTO = null;
		Optional<Employee> employee =  employeeRepository.findById(id);
		if (employee != null && employee.isPresent()) {
			return employeeDTO = converter.convertTOEmployeeDTO(employee.get());
		}else {
			return employeeDTO;
		}
	}

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
		Employee employee = converter.convertTOEmployeeEntity(employeeDTO);
		
		Employee dbEmployee = employeeRepository.saveAndFlush(employee);
	 	EmployeeDTO dto = converter.convertTOEmployeeDTO(dbEmployee);
		return dto;
	}

	@Override
	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(employeeDTO.getId());
		if (optionalEmployee != null && optionalEmployee.isPresent()) {
			Employee employee =  optionalEmployee.get();
			employee.setName(employeeDTO.getName());
			if (employeeDTO.getAddresses() != null && !employeeDTO.getAddresses().isEmpty()) {
				employee.setAddresses(addressService.updateAddresses(employeeDTO.getAddresses()));
			}
			employee = employeeRepository.saveAndFlush(employee);
			return converter.convertTOEmployeeDTO(employee);
		}else {
			return null;
		}
	}

	@Override
	public boolean deleteEmployee(Long id) {
		return false;
	}

}

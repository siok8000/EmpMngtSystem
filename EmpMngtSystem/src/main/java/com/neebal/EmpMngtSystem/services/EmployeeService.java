package com.neebal.EmpMngtSystem.services;

import java.util.List;

import com.neebal.EmpMngtSystem.dto.EmployeeDTO;

public interface EmployeeService {
	
	public List<EmployeeDTO> getEmployees();
	public EmployeeDTO getEmployee(Long id);
	public EmployeeDTO createEmployeeDTO(EmployeeDTO employeeDTO);

}

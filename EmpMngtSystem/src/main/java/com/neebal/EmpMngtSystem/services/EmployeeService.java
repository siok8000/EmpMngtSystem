package com.neebal.EmpMngtSystem.services;

import java.util.List;

import com.neebal.EmpMngtSystem.dto.EmployeeDTO;

public interface EmployeeService {
	
	List<EmployeeDTO> getEmployees();
	EmployeeDTO getEmployee(Long id);
	EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
	EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
	boolean deleteEmployee(Long id);

}

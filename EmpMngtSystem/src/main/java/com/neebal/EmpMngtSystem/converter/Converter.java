package com.neebal.EmpMngtSystem.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neebal.EmpMngtSystem.dto.DepartmentDTO;
import com.neebal.EmpMngtSystem.dto.EmployeeDTO;
import com.neebal.EmpMngtSystem.entities.Department;
import com.neebal.EmpMngtSystem.entities.Employee;

@Component
public class Converter {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public EmployeeDTO convertTOEmployeeDTO(Employee employee){
		EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
		return employeeDTO;
	}
	
	public Employee convertTOEmployeeEntity(EmployeeDTO employeeDTO){
		Employee employee = modelMapper.map(employeeDTO, Employee.class);
		return employee;
	}
	
	public DepartmentDTO convertTODepartmentDTO(Department department){
		DepartmentDTO departmentDTO = modelMapper.map(department, DepartmentDTO.class);
		return departmentDTO;
	}
	
	public Department convertTODeptEntity(DepartmentDTO departmentDTO){
		Department department = modelMapper.map(departmentDTO, Department.class);
		return department;
	}
	
	public List<DepartmentDTO> convertDeptEntityListTODTOList(List<Department> departments){
		List<DepartmentDTO> departmentDTOs = new ArrayList<DepartmentDTO>();
		for (Department department : departments) {
			departmentDTOs.add(modelMapper.map(department, DepartmentDTO.class));
		}
		
		return departmentDTOs;
	}
	
	public List<Department> convertDeptDTOListTOEntityList(List<DepartmentDTO> departmentDTOs){
		List<Department> departments = new ArrayList<Department>();
		for (DepartmentDTO departmentDTO : departmentDTOs) {
			departments.add(modelMapper.map(departmentDTO, Department.class));
		}
		
		return departments;
	}

}

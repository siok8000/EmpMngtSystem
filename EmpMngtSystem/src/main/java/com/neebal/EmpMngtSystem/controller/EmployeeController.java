package com.neebal.EmpMngtSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neebal.EmpMngtSystem.dto.EmployeeDTO;
import com.neebal.EmpMngtSystem.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/employee", method=RequestMethod.GET, produces="application/json")
	public List<EmployeeDTO> getEmployees(){
		return employeeService.getEmployees();
	}
	
	@RequestMapping(value = "/employee/{id}", method=RequestMethod.GET, produces="application/json")
	public EmployeeDTO getEmployee(@PathVariable("id") Long id){
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(value="/employee", method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO){
		EmployeeDTO dto = employeeService.createEmployeeDTO(employeeDTO);
		dto = employeeService.getEmployee(dto.getId());
		return dto;
	}

}

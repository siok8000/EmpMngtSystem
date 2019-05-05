package com.neebal.EmpMngtSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neebal.EmpMngtSystem.dto.DepartmentDTO;
import com.neebal.EmpMngtSystem.services.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value = "/department", method=RequestMethod.GET, produces="application/json")
	public List<DepartmentDTO> getDepartments(){
		return departmentService.getDepartments();
	}
	
	@RequestMapping(value="/department", method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public DepartmentDTO createDepartment(@RequestBody DepartmentDTO departmentDTO){
		return departmentService.createDepartment(departmentDTO);
	}
	
	@RequestMapping(value = "/department/{id}", method=RequestMethod.GET, produces="application/json")
	public DepartmentDTO getDepartment(@PathVariable Long id){
		return departmentService.getDepartment(id);
	}

}
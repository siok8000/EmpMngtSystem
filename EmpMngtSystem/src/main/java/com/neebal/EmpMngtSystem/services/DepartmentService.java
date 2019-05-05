package com.neebal.EmpMngtSystem.services;

import java.util.List;

import com.neebal.EmpMngtSystem.dto.DepartmentDTO;

public interface DepartmentService {
	
	List<DepartmentDTO> getDepartments();
	DepartmentDTO getDepartment(Long id);
	DepartmentDTO createDepartment(DepartmentDTO departmentDTO);
	DepartmentDTO updateDepartment(DepartmentDTO departmentDTO);
	boolean deleteDepartment(DepartmentDTO departmentDTO);

}

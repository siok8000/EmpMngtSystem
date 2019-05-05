package com.neebal.EmpMngtSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neebal.EmpMngtSystem.converter.Converter;
import com.neebal.EmpMngtSystem.dto.DepartmentDTO;
import com.neebal.EmpMngtSystem.entities.Department;
import com.neebal.EmpMngtSystem.repository.DepartmentRepository;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private Converter converter;
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<DepartmentDTO> getDepartments() {
		List<Department> departments = departmentRepository.findAll();
		if (departments != null && !departments.isEmpty()) {
			return converter.convertDeptEntityListTODTOList(departments);
		}else {
			return null;
		}
	}

	@Override
	public DepartmentDTO getDepartment(Long id) {
		Optional<Department> department = departmentRepository.findById(id);
		if (department != null && department.isPresent()) {
			return converter.convertTODepartmentDTO(department.get());
		}else {
			return null;
		}
	}

	@Override
	public DepartmentDTO createDepartment(DepartmentDTO departmentDTO) {
		Department department = converter.convertTODeptEntity(departmentDTO);
		Department dbResponse = departmentRepository.save(department);
		if (dbResponse!= null) {
			return converter.convertTODepartmentDTO(dbResponse);
		} else {
			return null;
		} 
	}

	@Override
	public DepartmentDTO updateDepartment(DepartmentDTO departmentDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDepartment(DepartmentDTO departmentDTO) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

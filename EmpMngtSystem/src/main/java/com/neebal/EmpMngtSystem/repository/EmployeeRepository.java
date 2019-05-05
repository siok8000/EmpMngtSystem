package com.neebal.EmpMngtSystem.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.neebal.EmpMngtSystem.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	Page<Employee> findById(Long id,Pageable pageable);

}

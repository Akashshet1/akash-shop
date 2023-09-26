package com.infy.employee1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.employee1.dtos.EmployeeDto;
import com.infy.employee1.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String> {

//	EmployeeDto findAll(List<EmployeeDto> employee);
	
	

}

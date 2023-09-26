package com.infy.employee1.services;

import java.util.List;

import com.infy.employee1.dtos.EmployeeDto;

public interface EmployeeService {
	
	//To create Employee
	EmployeeDto createEmployee(EmployeeDto employeeDto) ;
	
	//to update
	EmployeeDto updateEmployee(EmployeeDto employeeDto,String id);
	
	//to delete
	void deleteEmployee(String id);
	
	
	EmployeeDto getEmployeeById(String id);
	
	//
//	List<EmployeeDto> getEmployee(EmployeeDto employee);
	
	
	
	
	
	
	

}

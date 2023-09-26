package com.infy.employee1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.employee1.dtos.EmployeeDto;
import com.infy.employee1.services.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create")
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto ){
		
		EmployeeDto createEmployee = employeeService.createEmployee(employeeDto);
		return new ResponseEntity<>(createEmployee,HttpStatus.CREATED);	
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable String id){
		
		EmployeeDto getEmployee = employeeService.getEmployeeById(id);
		return new ResponseEntity<>(getEmployee,HttpStatus.OK);	
	}
	
	

}

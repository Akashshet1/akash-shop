package com.infy.employee1.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.employee1.dtos.EmployeeDto;
import com.infy.employee1.entities.Employee;
import com.infy.employee1.repository.EmployeeRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		
		Employee employee = mapper.map(employeeDto,Employee.class);
		
		String employeeId = UUID.randomUUID().toString();
		employee.setId(employeeId);
		Employee savedEmployee = employeeRepo.save(employee);
			
		return mapper.map(savedEmployee, EmployeeDto.class);
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto employeeDto, String id) {
		
		Employee employee = employeeRepo.findById(id).orElseThrow(()->new EntityNotFoundException("Employee not found with given id"));
		employee.setName(employeeDto.getName());
		employee.setAge(employeeDto.getAge());
		employee.setGender(employeeDto.getGender());
		
		Employee updatedEmployee = employeeRepo.save(employee);
		
		return mapper.map(updatedEmployee, EmployeeDto.class);
	}

	@Override
	public void deleteEmployee(String id) {
		
		Employee employee = employeeRepo.findById(id).orElseThrow(()->new EntityNotFoundException("Employee not found with given id"));
		
		employeeRepo.delete(employee);
		
	}

	@Override
	public EmployeeDto getEmployeeById(String id) {
		
		Employee employee = employeeRepo.findById(id).orElseThrow(()->new EntityNotFoundException("Employee not found with given id"));
		
		 return mapper.map(employee, EmployeeDto.class);
		
		
	}

//	@Override
//	public List<EmployeeDto> getEmployee(EmployeeDto employeeDto) {
//		
//		List<EmployeeDto> employee = List.of(employeeDto);
//		EmployeeDto allEmployeee = employeeRepo.findAll(employee);
//		
//		
//		
//		return (List<EmployeeDto>) mapper.map(allEmployeee, EmployeeDto.class);
//	}
//
}

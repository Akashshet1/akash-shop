package com.infy.employee1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Employee {
	
	@Id
	@Column(name="employee_id")
	private String id;
	
	@Column(name="employee_name")
	private String name;
	
	@Column(name="employee_age")
	private String age;
	
	@Column(name="employee_city")
	private String city;

}

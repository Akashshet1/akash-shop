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
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Employee {
	
	@Id
	@Column(name="emp_id")
	private String id;
	
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_age")
	private String age;
	@Column(name="emp_gender")
	private String gender;

}

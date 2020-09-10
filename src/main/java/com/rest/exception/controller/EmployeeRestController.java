/**
 * 
 */
package com.rest.exception.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rest.exception.custom.EmployeeNotfoundException;
import com.rest.exception.model.Employee;

/**
 * @author siva
 *
 */
@RestController
public class EmployeeRestController {
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> getOneEmployee(
			@PathVariable Integer id)
	{
		if(id!=5)
			throw new EmployeeNotfoundException("EMPLOYEE NOT EXIST " + id);
		
		return ResponseEntity.ok(new Employee(id,"SIva"));
	}

}

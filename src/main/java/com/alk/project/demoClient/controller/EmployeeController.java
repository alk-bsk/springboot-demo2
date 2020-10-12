package com.alk.project.demoClient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.alk.project.demoClient.model.Employee;
import com.alk.project.demoClient.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/emp")
	public ResponseEntity<List<Employee>> getEmployee(@RequestHeader("Authorization") String header){
		return new ResponseEntity<List<Employee>>(employeeService.getEmployee(header),HttpStatus.OK);
	}
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<Employee> getEmployeeById(@RequestHeader("Authorization") String header, @PathVariable("id") long id){
		return new ResponseEntity<Employee>(employeeService.getEmpById(header, id),HttpStatus.OK);
	}


}

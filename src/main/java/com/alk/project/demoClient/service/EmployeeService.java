package com.alk.project.demoClient.service;

import java.util.List;

import com.alk.project.demoClient.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployee(String header);
	public Employee getEmpById(String header,long id);
}

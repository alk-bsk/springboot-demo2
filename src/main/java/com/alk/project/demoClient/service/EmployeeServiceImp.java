package com.alk.project.demoClient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alk.project.demoClient.feign.FeignEmployee;
import com.alk.project.demoClient.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	FeignEmployee FeignEmployee;

	@Override
	public List<Employee> getEmployee(String header) {
		return FeignEmployee.getEmps(header);
	}

	@Override
	public Employee getEmpById(String header, long id) {
		return FeignEmployee.getEmpById(header, id);
	}

}

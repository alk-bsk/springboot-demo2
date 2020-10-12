package com.alk.project.demoClient.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alk.project.demoClient.model.Employee;


@FeignClient(value="employee", url="http://localhost:8082")
public interface FeignEmployee {

	@RequestMapping(method = RequestMethod.GET, value = "/employee")
	List<Employee> getEmps(@RequestHeader("Authorization") String header);
	
	@RequestMapping(method = RequestMethod.GET, value = "/employee/id/{id}", produces = "application/json")
	Employee getEmpById(@RequestHeader("Authorization") String header,@PathVariable("id") long id);
	
}

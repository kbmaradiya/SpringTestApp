package org.app.controller;

import java.util.List;

import org.app.model.Employee;
import org.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET, value = "/get_user")
	public List<Employee> getEmployee() {

		return employeeService.getEmployees();

	}

	
	@RequestMapping(method = RequestMethod.POST,value="/add_user")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/update_user")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE,value="/delete_user")
	public void deleteEmployee(@RequestBody Employee employee) {
		employeeService.deleteEmployee(employee);

	}


}

package org.app.service;

import java.util.ArrayList;
import java.util.List;

import org.app.model.Employee;
import org.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void saveEmployee(Employee employee) {
		Employee employeeResult =employeeRepository.save(employee);
		
	
	}
	
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}

	
	public List<Employee> getEmployees(){
		Iterable<Employee> employeeList=employeeRepository.findAll();
		List<Employee> list=new ArrayList();
		employeeList.forEach(list::add);
		return list;
		
	}
	
}

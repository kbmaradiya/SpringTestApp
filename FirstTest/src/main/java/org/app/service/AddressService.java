package org.app.service;

import java.util.ArrayList;
import java.util.List;

import org.app.model.Address;
import org.app.model.Employee;
import org.app.repository.AddressRepository;
import org.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService  {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public void saveAddress(Address address) {
		Address addressResult =addressRepository.save(address);
		
	
	}
	
	public void updateAddress(Address address) {
		addressRepository.save(address);
	}
	
	public void deleteAddress(Address address) {
		addressRepository.delete(address);
	}

	
	public List<Address> getAddress(){
		Iterable<Address> employeeList=addressRepository.findAll();
		List<Address> list=new ArrayList();
		employeeList.forEach(list::add);
		return list;
		
	}
	

}

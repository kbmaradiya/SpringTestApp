package org.app.controller;

import java.util.List;

import org.app.model.Address;
import org.app.model.Employee;
import org.app.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	
	@Autowired
	private AddressService  addressService;

	
	
	@RequestMapping(method = RequestMethod.GET, value = "/get_address")
	public List<Address> getEmployee() {

		return addressService.getAddress();

	}
	

}

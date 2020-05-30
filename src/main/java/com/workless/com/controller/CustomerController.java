package com.workless.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workless.com.entity.Customer;
import com.workless.com.entity.Product;
import com.workless.com.service.ServiceCustomerImpl;

@RestController
@RequestMapping("/kitas-bandymas")
public class CustomerController {

	
	
	
	@Autowired
	ServiceCustomerImpl serviceCustomer;
	
	@GetMapping("/customeriai")
	public List<Customer> getAllCustomers() {
	return serviceCustomer.findAllCust();
}
	
}

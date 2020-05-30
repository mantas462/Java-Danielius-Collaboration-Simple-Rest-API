package com.workless.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workless.com.entity.Customer;
import com.workless.com.repository.CustomerRepo;

@Service
public class ServiceCustomerImpl implements ServiceCustomer {

	@Autowired
	CustomerRepo customerRepository;
	
	@Override
	public List<Customer> findAllCust() {

		return customerRepository.findAll();
		
	}

}

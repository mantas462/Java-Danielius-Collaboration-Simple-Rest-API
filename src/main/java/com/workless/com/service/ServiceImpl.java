package com.workless.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workless.com.entity.Product;
import com.workless.com.repository.ProductRepo;



@Service
public class ServiceImpl implements ServiceProducts {

	@Autowired
	ProductRepo productRepository;
	
	@Override
	public List<Product> findProduktai() {
		
		return productRepository.findAll();
	}

}

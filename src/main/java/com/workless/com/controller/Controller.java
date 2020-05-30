package com.workless.com.controller;

import java.util.List;

import org.openjdk.jmh.annotations.Benchmark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workless.com.entity.Product;
import com.workless.com.service.ServiceImpl;

@RestController
@RequestMapping("/bandymas")
public class Controller {
	
	
	@Autowired
	ServiceImpl serviceImpl;
	
		@GetMapping("/roles")
		@Benchmark
		public List<Product> getAllProducts() {
		return serviceImpl.findProduktai();
	}

}

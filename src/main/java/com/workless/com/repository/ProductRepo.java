package com.workless.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workless.com.entity.Customer;
import com.workless.com.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}

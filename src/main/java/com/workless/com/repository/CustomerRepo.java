package com.workless.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workless.com.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}

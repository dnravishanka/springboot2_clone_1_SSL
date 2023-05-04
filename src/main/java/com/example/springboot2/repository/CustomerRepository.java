package com.example.springboot2.repository;

import com.example.springboot2.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer , String> {
    Optional<Customer> findAllById(String id);
    Optional<Customer> findCustomerByAddress(String address);

    Optional<Customer> findCustomerByName(String name);



}

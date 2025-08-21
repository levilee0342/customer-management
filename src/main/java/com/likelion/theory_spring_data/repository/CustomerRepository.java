package com.likelion.theory_spring_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.likelion.theory_spring_data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
    Boolean existsByEmail(String email);
}

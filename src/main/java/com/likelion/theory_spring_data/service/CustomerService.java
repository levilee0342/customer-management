package com.likelion.theory_spring_data.service;

import java.util.List;

import com.likelion.theory_spring_data.dto.CustomerDto;

public interface CustomerService {
    void createCustomer(CustomerDto customerDto);
    CustomerDto getCustomerById(Long id);
    CustomerDto getCustomerByEmail(String email);
    List<CustomerDto> getAllCustomers();
    void updateCustomer(Long id, CustomerDto customerDto);
    void deleteCustomer(Long id);
}

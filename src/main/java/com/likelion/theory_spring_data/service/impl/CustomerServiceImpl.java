package com.likelion.theory_spring_data.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.likelion.theory_spring_data.dto.CustomerDto;
import com.likelion.theory_spring_data.entity.Customer;
import com.likelion.theory_spring_data.mapper.CustomerMapper;
import com.likelion.theory_spring_data.repository.CustomerRepository;
import com.likelion.theory_spring_data.service.CustomerService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    @Transactional
    @Override
    public void createCustomer(CustomerDto customerDto) {
        Optional.ofNullable(customerRepository.findByEmail(customerDto.getEmail()))
                .ifPresentOrElse(
                        existing -> {
                            throw new IllegalArgumentException(
                                    "Customer already exists with email: " + customerDto.getEmail());
                        },
                        () -> {
                            Customer newCustomer = customerMapper.toEntity(customerDto);
                            customerRepository.save(newCustomer);
                        });
    }

    @Override
    public CustomerDto getCustomerById(Long id) {
        return customerRepository.findById(id)
                .map(customerMapper::toDto)
                .orElse(null);
    }

    @Override
    public CustomerDto getCustomerByEmail(String email) {
        return Optional.ofNullable(customerRepository.findByEmail(email))
                .map(customerMapper::toDto)
                .orElse(null);
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return customerRepository.findAll().stream()
                .map(customerMapper::toDto)
                .collect(Collectors.toList());
    }
    @Transactional
    @Override
    public void updateCustomer(Long id, CustomerDto customerDto) {
        customerRepository.findById(id)
        .ifPresentOrElse(
            existing -> {
                customerMapper.updateEntity(customerDto, existing);
                customerRepository.save(existing);
            },
            () -> {
                throw new NoSuchElementException("Customer not found with id: " + id);
            });
    }
    @Transactional
    @Override
    public void deleteCustomer(Long id) {
        Optional.ofNullable(customerRepository.findById(id))
                .ifPresentOrElse(
                        existing -> {
                            customerRepository.deleteById(id);
                        },
                        () -> {
                            throw new NoSuchElementException("Customer not found with id: " + id);
                        });
    }
    
}

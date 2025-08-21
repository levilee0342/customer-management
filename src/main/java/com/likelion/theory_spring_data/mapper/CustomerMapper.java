package com.likelion.theory_spring_data.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.likelion.theory_spring_data.dto.CustomerDto;
import com.likelion.theory_spring_data.entity.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDto toDto(Customer entity);
    Customer toEntity(CustomerDto dto);
    List<CustomerDto> toListDto(List<Customer> entities);
    void updateEntity(CustomerDto dto, @MappingTarget Customer entity);
    
} 
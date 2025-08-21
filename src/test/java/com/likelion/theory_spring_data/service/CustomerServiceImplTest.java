//package com.likelion.theory_spring_data.service;
//
//import com.likelion.theory_spring_data.dto.CustomerDto;
//import com.likelion.theory_spring_data.entity.Customer;
//import com.likelion.theory_spring_data.mapper.CustomerMapper;
//import com.likelion.theory_spring_data.repository.CustomerRepository;
//import com.likelion.theory_spring_data.service.impl.CustomerServiceImpl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//public class CustomerServiceImplTest {
//    @Mock
//    CustomerRepository repository;
//
//    @Mock
//    CustomerMapper mapper;
//
//    CustomerServiceImpl service;
//
//    Customer entity1, entity2;
//    CustomerDto dto1, dto2;
//
//    @BeforeEach
//    void setUp() {
//        service = new CustomerServiceImpl(repository, mapper);
//
//        entity1 = Customer.builder().id(1L).name("Alice").email("Alice@gmail.com").address("HN").build();
//
//        entity2 = Customer.builder().id(2L).name("Bob").email("Bob@gmail.com").address("HCM").build();
//
//        dto1 = CustomerDto.builder().id(3L).name("Alice").email("Alice@gmail.com").address("HN").build();
//
//        dto2 = CustomerDto.builder().id(2L).name("Bob").email("Bob@gmail.com").address("HCM").build();
//    }
//
//    @Test
//    void createCustomer_shouldSave_whenEmailNotExist() {
//        when(repository.existsByEmail("Alice@gmail.com")).thenReturn(false);
//        when(mapper.toEntity(dto1)).thenReturn(entity1);
//        when(repository.save(entity1)).thenReturn(entity1);
//
//        service.createCustomer(dto1);
//
//        verify(repository).existsByEmail("Alice@gmail.com");
//        verify(mapper).toEntity(dto1);
//        verify(repository).save(entity1);
//    }
//}

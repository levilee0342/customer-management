//package com.likelion.theory_spring_data.repository;
//
//import com.likelion.theory_spring_data.entity.Customer;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.ActiveProfiles;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//@DataJpaTest
//@ActiveProfiles("test")
//public class CustomerRepositoryTest {
//    @Autowired
//    TestEntityManager testEntityManager;
//
//    @Autowired
//    CustomerRepository customerRepository;
//
//    private Customer customer1, customer2, customer3;
//
//    @BeforeEach
//    void setUp() {
//        customer1 = testEntityManager.persist(
//                new Customer(null, "Alice", "Alice@gmail.com", "HN"));
//        customer2 = testEntityManager.persist(
//                new Customer(null, "Bob", "Bob@gmail.com", "HCM"));
//        customer3 = testEntityManager.persist(
//                new Customer(null, "Charlie", "Charlie@gmail.com", "DN"));
//        testEntityManager.flush();
//    }
//
//    @Test
//    void findByEmail_shouldReturnCustomer_whenCustomerExists() {
//        Customer found = customerRepository.findByEmail("Alice@gmail.com");
//        assertThat(found).isNotNull();
//        assertThat(found.getEmail()).isEqualTo("Alice@gmail.com");
//    }
//
//}

//package com.likelion.theory_spring_data.mapper;
//
//import com.likelion.theory_spring_data.dto.CustomerDto;
//import com.likelion.theory_spring_data.entity.Customer;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mapstruct.factory.Mappers;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//public class CustomerMapperTest {
//    private CustomerMapper mapper;
//
//    @BeforeEach
//    void SetUp() {
//        mapper = Mappers.getMapper(CustomerMapper.class);
//    }
//
//    @Test
//    void toDto_mapsAllFields() {
//        Customer entity = Customer.builder()
//                .id(1L).email("Alice@gmail.com").address("HN").build();
//        CustomerDto dto = mapper.toDto(entity);
//
//        assertThat(dto.getId()).isEqualTo(1L);
//        assertThat(dto.getName()).isEqualTo("Alice");
//        assertThat(dto.getEmail()).isEqualTo("Alice@gmail.com");
//        assertThat(dto.getAddress()).isEqualTo("HN");
//    }
//
//
//}

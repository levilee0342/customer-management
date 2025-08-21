//package com.likelion.theory_spring_data.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.likelion.theory_spring_data.dto.CustomerDto;
//import com.likelion.theory_spring_data.service.CustomerService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.MediaType;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.bean.override.mockito.MockitoBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.List;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//public class CustomerControllerTest {
//    @Autowired
//    MockMvc mvc;
//
//    @Autowired
//    ObjectMapper om;
//
//    @MockitoBean
//    CustomerService customerService;
//
//    private final CustomerDto dto1 =
//            CustomerDto.builder().id(1L).name("Alice").email("alice@gmail.com").address("HN").build();
//
//    private final CustomerDto dto2 =
//            CustomerDto.builder().id(2L).name("Bob").email("bob@gmail.com").address("HCM").build();
//
//    @Test
//    void getAllCustomers_shouldReturn200_andList() throws Exception {
//        when(customerService.getAllCustomers()).thenReturn(List.of(dto1,dto2));
//
//        mvc.perform(get("api/customers"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//
//    }
//}

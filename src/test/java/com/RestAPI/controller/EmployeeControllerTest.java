//package com.RestAPI.controller;
//
//import com.RestAPI.model.Employee;
//import com.RestAPI.service.EmployeeService;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(EmployeeController.class)
//class EmployeeControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private EmployeeService employeeService;
//
//    Employee employeeOne;
//    Employee employeeTwo;
//    List<Employee> employeeList = new ArrayList<>();
//
//    @BeforeEach
//    void setUp() {
//        employeeOne = new Employee(1,"Paras","Gurgaon","8437861802");
//        employeeTwo = new Employee(2,"Aarushi","Gurgaon","8827666251");
//        employeeList.add(employeeOne);
//        employeeList.add(employeeTwo);
//
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//    @Test
//    void testGetEmployee() throws Exception {
//        when(employeeService.getEmployee(1)).thenReturn(employeeOne);
//        this.mockMvc.perform(get("/employee/1")).andDo(print())
//                .andExpect(status().isOk());
//
//    }
//
//    @Test
//    void testGetAllEmployee() throws Exception {
//        when(employeeService.getAllEmployee()).thenReturn(employeeList);
//        this.mockMvc.perform(get("/employee")).andDo(print())
//                .andExpect(status().isOk());    }
//
//    @Test
//    void testCreateEmployee() throws Exception {
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        String requestJson = objectMapper.writeValueAsString(employeeOne);
//
//        when(employeeService.createEmployee(employeeOne))
//                .thenReturn("Employee created successfully");
//        this.mockMvc.perform(post("/employee")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(requestJson))
//                .andDo(print()).andExpect(status().isCreated());
//    }
//
//    @Test
//    void testUpdateEmployee() throws Exception {
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        String requestJson = objectMapper.writeValueAsString(employeeOne);
//
//        when(employeeService.createEmployee(employeeOne))
//                .thenReturn("Employee updated successfully");
//        this.mockMvc.perform(put("/employee")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(requestJson))
//                .andDo(print()).andExpect(status().isOk());
//    }
//
//    @Test
//    void testDeleteEmployee() throws Exception {
//        // Mocking the deleteEmployee method to have void behavior
//        doNothing().when(employeeService).deleteEmployee(1);
//
//        this.mockMvc.perform(delete("/employee/1"))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }
//}
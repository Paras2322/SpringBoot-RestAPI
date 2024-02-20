//package com.RestAPI.service;
//
//import com.RestAPI.model.Employee;
//import com.RestAPI.repository.EmployeeRepository;
//import com.RestAPI.service.implementation.EmployeeServiceImpl;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import static org.assertj.core.api.Assertions.assertThat;
//
//
//import java.util.*;
//
//import static org.mockito.Mockito.when;
//
//class EmployeeServiceImplTest {
//
//    private EmployeeServiceImpl employeeService;
//
//    @Mock
//    private EmployeeRepository employeeRepository;
//
//    private AutoCloseable autoCloseable;
//
//    private Employee employee;
//
//    @BeforeEach
//    void setUp() {
//        autoCloseable = MockitoAnnotations.openMocks(this);
//        employeeService = new EmployeeServiceImpl(employeeRepository);
//        employee = new Employee(1, "Paras", "Gurgaon", "8437861802");
//    }
//
//    @AfterEach
//    void tearDown() throws Exception {
//        autoCloseable.close();
//    }
//
//    @Test
//    void testCreateEmployee() {
//        when(employeeRepository.save(employee)).thenReturn(employee);
//        assertThat(employeeService.createEmployee(employee)).isEqualTo("Employee Added Successfully !!");
//    }
//
//    @Test
//    void testUpdateEmployee() {
//        when(employeeRepository.existsById(1)).thenReturn(true);
//        when(employeeRepository.save(employee)).thenReturn(employee);
//        assertThat(employeeService.updateEmployee(employee)).isEqualTo("Employee Updated Successfully");
//    }
//
//    @Test
//    void testDeleteEmployee() {
//        when(employeeRepository.existsById(1)).thenReturn(true);
//        employeeService.deleteEmployee(1);
//    }
//
//
//    @Test
//    void testGetEmployee() {
//        when(employeeRepository.findById(1)).thenReturn(Optional.ofNullable(employee));
//        assertThat(employeeService.getEmployee(1).getEmpName()).isEqualTo(employee.getEmpName());
//    }
//
//
//    @Test
//    void testGetAllEmployee() {
//        // Mocking the findAll method to return a list of employees
//        when(employeeRepository.findAll()).thenReturn(List.of(employee));
//        assertThat(employeeService.getAllEmployee()).contains(employee);
//    }
//}
//

package com.RestAPI.controller;

import com.RestAPI.model.Employee;
import com.RestAPI.response.ResponseHandler;
import com.RestAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("{empId}")
    public ResponseEntity<Object> getEmployee(@PathVariable("empId") Integer empId) {
        Employee employee = employeeService.getEmployee(empId);
        return ResponseHandler.responseBuilder("Employee retrieved successfully", HttpStatus.OK, employee);
    }

    @GetMapping
    public ResponseEntity<Object> getAllEmployee() {
        List<Employee> employees = employeeService.getAllEmployee();
        return ResponseHandler.responseBuilder("Employees retrieved successfully", HttpStatus.OK, employees);
    }

    @PostMapping
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        return ResponseHandler.responseBuilder("Employee created successfully", HttpStatus.CREATED, employee);
    }

    @PutMapping
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
        return ResponseHandler.responseBuilder("Employee updated Successfully", HttpStatus.OK, employee);
    }

    @DeleteMapping("{empId}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable("empId") Integer empId) {
        employeeService.deleteEmployee(empId);
        return ResponseHandler.responseBuilder("Employee deleted successfully", HttpStatus.OK, null);
    }

}

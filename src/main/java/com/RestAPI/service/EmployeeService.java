package com.RestAPI.service;

import com.RestAPI.model.Employee;

import java.util.List;

public interface EmployeeService {

    String createEmployee(Employee employee);

    String updateEmployee(Employee employee);

    void deleteEmployee(Integer empId); // Changed parameter type to Integer

    Employee getEmployee(Integer empId); // Changed return type and parameter type to Integer

    List<Employee> getAllEmployee();
}
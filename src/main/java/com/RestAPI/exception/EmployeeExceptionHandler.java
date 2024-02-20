package com.RestAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {

    @ExceptionHandler(value = {EmployeeNotFoundException.class})
    public ResponseEntity<Object> handleEmployeeNotFoundException(EmployeeNotFoundException employeeNotFoundException) {
        EmployeeException employeeException = new EmployeeException(
                employeeNotFoundException.getMessage(),
                employeeNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {NoEmployeesFoundException.class})
    public ResponseEntity<Object> handleNoEmployeesFoundException(NoEmployeesFoundException noEmployeesFoundException) {
        EmployeeException employeeException = new EmployeeException(
                noEmployeesFoundException.getMessage(),
                noEmployeesFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleOtherExceptions(Exception ex) {
        return new ResponseEntity<>("An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

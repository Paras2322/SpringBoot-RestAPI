package com.RestAPI.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class EmployeeException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
}

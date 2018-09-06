package com.andreitop.newco.Exception;

import org.springframework.http.HttpStatus;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class ApiError {

    private HttpStatus httpStatus;
    private String message;
    private List<String> errors;

    public ApiError(HttpStatus httpStatus, String message, List<String> errors){
        super();
        this.httpStatus = httpStatus;
        this.message = message;
        this.errors = errors;
    }

    public ApiError(HttpStatus httpStatus, String message, String error){
        super();
        this.httpStatus = httpStatus;
        this.message = message;
        this.errors = Arrays.asList(error);
    }
}

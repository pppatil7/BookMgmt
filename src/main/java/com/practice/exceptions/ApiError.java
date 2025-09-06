package com.practice.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ApiError {

    private LocalDateTime timeStamp;

    private String error;

    private HttpStatus statusCode;

    public ApiError(LocalDateTime timeStamp) {
        this.timeStamp = LocalDateTime.now();
    }

    public ApiError(String error, HttpStatus statusCode) {
        this();
        this.error = error;
        this.statusCode = statusCode;
    }
}

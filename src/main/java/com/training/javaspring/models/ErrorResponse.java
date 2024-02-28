package com.training.javaspring.models;

import lombok.Data;

@Data
public class ErrorResponse {
    private int statusCode;
    private boolean status;
    private String message;

}

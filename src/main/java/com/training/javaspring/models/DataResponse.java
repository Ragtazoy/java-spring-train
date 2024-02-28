package com.training.javaspring.models;

import lombok.Data;

@Data
public class DataResponse {
    private Object data;

    public DataResponse(Object data, String message, int status) {
        this.data = data;
    }
}

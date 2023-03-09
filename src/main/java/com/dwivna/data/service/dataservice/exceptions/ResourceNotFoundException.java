package com.dwivna.data.service.dataservice.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String variable, String resource) {
        super(variable + " : " + resource + " not found");
    }
}

package com.sysmap.srcmsportability.framework.adapters.in.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PortabilityNotFound extends RuntimeException{

    public PortabilityNotFound(String message){
        super(message);
    }
}

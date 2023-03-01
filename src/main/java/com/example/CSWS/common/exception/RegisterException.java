package com.example.CSWS.common.exception;

import lombok.Getter;

@Getter
public class RegisterException extends RuntimeException{
    private final ErrorCode errorCode;

    public RegisterException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}

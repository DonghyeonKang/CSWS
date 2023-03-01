package com.example.CSWS.common.exception;

import lombok.Getter;

@Getter
public class EntityNotFoundException extends RuntimeException {
    private final ErrorCode errorCode;

    public EntityNotFoundException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}

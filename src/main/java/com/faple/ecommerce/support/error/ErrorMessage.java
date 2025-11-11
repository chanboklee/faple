package com.faple.ecommerce.support.error;

import lombok.Getter;

@Getter
public class ErrorMessage<T> {

    private final String code;
    private final String message;
    private final T data;

    public ErrorMessage(ErrorType errorType, T data) {
        this.code = errorType.getCode().name();
        this.message = errorType.getMessage();
        this.data = data;
    }
}

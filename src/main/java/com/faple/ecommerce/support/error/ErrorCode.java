package com.faple.ecommerce.support.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {

    E500("INTERNAL_SERVER_ERROR"),
    E400("BAD_REQUEST"),
    E401("UNAUTHORIZED");

    private final String text;
}

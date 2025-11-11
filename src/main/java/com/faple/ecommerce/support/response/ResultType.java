package com.faple.ecommerce.support.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ResultType {
    SUCCESS("성공"),
    ERROR("에러");

    private final String text;
}

package com.faple.ecommerce.domain.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum OrderStatus {

    ORDERED("주문"),
    CANCELED("주문취소");

    private final String text;

}

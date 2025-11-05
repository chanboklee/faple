package com.faple.ecommerce.domain.orderitem;

import com.faple.ecommerce.domain.BaseEntity;
import com.faple.ecommerce.domain.product.ProductEntity;
import com.faple.ecommerce.domain.order.OrderEntity;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@ToString
public class OrderItemEntity extends BaseEntity {

    /**
     * 대리 키 (PK)
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long orderItemId;

    /**
     * 주문ID (FK)
     * */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private OrderEntity order;

    /**
     * 상품ID (FK)
     * */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private ProductEntity product;

    /**
     * 주문 가격
     * */
    @Column(name = "order_item_price", nullable = false)
    private int orderItemPrice;

    /**
     * 주문 수량
     * */
    @Column(name = "order_item_quantity", nullable = false)
    private int orderItemQuantity;

}

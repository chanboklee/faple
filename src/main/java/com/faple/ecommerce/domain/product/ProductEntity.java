package com.faple.ecommerce.domain.product;

import com.faple.ecommerce.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "product")
@Entity
public class ProductEntity extends BaseEntity {

    /**
     * 대리 키 (PK)
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    /**
     * 상품명
     * */
    @Column(name = "product_name", nullable = false)
    private String productName;

    /**
     * 상품 가격
     * */
    @Column(name = "product_price", nullable = false)
    private int productPrice;

    /**
     * 상품 수량
     * */
    @Column(name = "product_quantity", nullable = false)
    private int productQuantity;

    /**
     * 재고 차감
     * @param quantity 주문 수량
     * */
    public void removeProductQuantity(int quantity) {
        int currentProductQuantity = productQuantity - quantity;
        if(currentProductQuantity < 0) {
            throw new RuntimeException("Product quantity cannot be negative");
        }
    }
}

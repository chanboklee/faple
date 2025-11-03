package com.faple.ecommerce.domain.order;

import com.faple.ecommerce.domain.BaseEntity;
import com.faple.ecommerce.domain.member.MemberEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "orders")
@Entity
public class OrderEntity extends BaseEntity {

    /**
     * 대리 키 (PK)
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 회원ID (FK)
     * */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private MemberEntity member;

    /**
     * 주문 상태
     * ORDERED (주문)
     * CANCELED (주문취소)
     * */
    @Enumerated(EnumType.STRING)
    @Column(name = "order_status", nullable = false)
    private OrderStatus orderStatus;

    /**
     * 주문 일시
     * */
    @Column(name = "ordered_at", nullable = false)
    private LocalDateTime orderedAt;

}

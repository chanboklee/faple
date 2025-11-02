package com.faple.ecommerce.domain.member;

import com.faple.ecommerce.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "member")
@Entity
public class MemberEntity extends BaseEntity {

    /**
     * 대리 키 (PK)
     **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    /**
     * 이름
     * */
    @Column(name = "member_name", nullable = false)
    private String memberName;

    /**
     * 이메일 (UNIQUE)
     * uq_email
     * */
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    /**
     * 비밀번호
     * */
    @Column(name = "password", nullable = false)
    private String password;

}

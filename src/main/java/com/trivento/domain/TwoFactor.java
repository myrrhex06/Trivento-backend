package com.trivento.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TwoFactor {

    // 2FA ID
    private Long twoFactorId;

    // 비밀키
    private String secretKey;

    // 사원 ID
    private Long employeeId;

    // 생성일시
    private LocalDateTime regDate;

    // 수정일시
    private LocalDateTime modDate;
}

package com.trivento.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {

    // 권한 ID
    private Long roleId;

    // 권한명
    private String roleName;

    // 생성일시
    private LocalDateTime regDate;

    // 수정일시
    private LocalDateTime modDate;
}

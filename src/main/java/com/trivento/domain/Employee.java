package com.trivento.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    // 사원 ID
    private Long employeeId;

    // 이메일
    private String email;

    // 비밀번호
    private String password;

    // 이름
    private String name;

    // 나이
    private Integer age;

    // 부서 ID
    private Long departmentId;

    // 직급 ID
    private Long rankId;

    // 생성일시
    private LocalDateTime regDate;

    // 수정일시
    private LocalDateTime modDate;
}

package com.trivento.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    // 부서 ID
    private Long departmentId;

    // 부서명
    private String departmentName;
}

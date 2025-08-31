package com.trivento.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkLog {

    // 기록 ID
    private Long logId;

    // 사원 ID
    private Long employeeId;

    // 출근 시각
    private LocalDateTime checkInDate;

    // 퇴근 시각
    private LocalDateTime checkOutDate;

    // 지각 여부
    private String lateYn;

    // 등록일시
    private LocalDateTime regDate;

    // 수정일시
    private LocalDateTime modDate;
}

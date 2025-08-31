package com.trivento.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rank {

    // 직급 ID
    private Long rankId;

    // 직급명
    private String rankName;
}

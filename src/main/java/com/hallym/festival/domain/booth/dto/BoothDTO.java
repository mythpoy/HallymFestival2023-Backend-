package com.hallym.festival.domain.booth.dto;


import com.hallym.festival.domain.booth.entity.BoothType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoothDTO {

    private Long bno;

    @NotEmpty(message = "부스 이름은 필수 입력 값입니다.")
    @Size(min = 3, max = 100)
    private String booth_title;

    @NotEmpty //NULL, 빈 문자열 불가
    private String booth_content;

    @NotEmpty
    private String writer;

    @NotNull
    private BoothType booth_type;

    private Boolean active;

    private LocalDateTime regDate;

    private LocalDateTime modDate;

}
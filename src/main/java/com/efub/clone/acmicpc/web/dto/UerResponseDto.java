package com.efub.clone.acmicpc.web.dto;

import com.efub.clone.acmicpc.domain.user.User;
import lombok.Getter;

@Getter
public class UerResponseDto {
    private String id;
    private String introduce;
    private Long rank;

    public UerResponseDto(User entity){
        this.id = entity.getId();
        this.introduce = entity.getIntroduce();
        this.rank = entity.getRank();
    }

}


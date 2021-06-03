package com.efub.clone.acmicpc.web.dto;

import com.efub.clone.acmicpc.domain.user.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private String id;
    private String introduce;
    private Long rank;

    public UserResponseDto(User entity){
        this.id = entity.getId();
        this.introduce = entity.getIntroduce();
        this.rank = entity.getRank();
    }

}


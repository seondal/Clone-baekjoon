package com.efub.clone.acmicpc.web.dto;

import com.efub.clone.acmicpc.domain.user.User;
import lombok.Getter;

@Getter
public class BoardListResponseDto {
    private String title;
    private String category;
    private User user;

    public BoardListResponseDto(){

    }

}

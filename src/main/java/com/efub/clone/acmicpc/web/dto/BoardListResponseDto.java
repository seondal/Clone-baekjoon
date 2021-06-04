package com.efub.clone.acmicpc.web.dto;

import com.efub.clone.acmicpc.domain.board.Board;
import com.efub.clone.acmicpc.domain.problem.Problem;
import com.efub.clone.acmicpc.domain.user.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardListResponseDto {
    private String title;
    private Problem problem;
    private String category;
    private User user;
    private LocalDateTime create_date;

    public BoardListResponseDto(Board entity){
        this.title = entity.getTitle();
        this.problem = entity.getProblem();
        this.category = entity.getCategory();
        this.user = entity.getUser();
        this.create_date = entity.getCreate_date();
    }

}

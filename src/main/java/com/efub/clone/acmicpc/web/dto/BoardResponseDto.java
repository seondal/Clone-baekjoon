package com.efub.clone.acmicpc.web.dto;

import com.efub.clone.acmicpc.domain.board.Board;
import com.efub.clone.acmicpc.domain.problem.Problem;
import com.efub.clone.acmicpc.domain.user.User;
import lombok.Getter;

@Getter
public class BoardResponseDto {
    private Long id;
    private String title;
    private Problem problem;
    private String category;
    private String content;
    private User user;

    public BoardResponseDto(Board entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.problem = entity.getProblem();
        this.category = entity.getCategory();
        this.content = entity.getContent();
        this.user = entity.getUser();
    }
}

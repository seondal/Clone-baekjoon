package com.efub.clone.acmicpc.web.dto;

import com.efub.clone.acmicpc.domain.problem.Problem;
import com.efub.clone.acmicpc.domain.user.User;
import lombok.Getter;

@Getter
public class ProblemResponseDto {
    private Long id;
    private String title;
    private String content;
    private String input_condition;
    private String output_condition;

    public ProblemResponseDto(Problem entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.input_condition = entity.getInput_condition();
        this.output_condition = entity.getOutput_condition();
    }

}

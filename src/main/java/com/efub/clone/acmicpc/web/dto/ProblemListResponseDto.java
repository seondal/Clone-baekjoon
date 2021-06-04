package com.efub.clone.acmicpc.web.dto;

import com.efub.clone.acmicpc.domain.problem.Problem;
import lombok.Getter;

@Getter
public class ProblemListResponseDto {
    private Long id;
    private String title;
    private Long rank;
    private boolean isMultilingual;

    public ProblemListResponseDto(Problem entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.rank = entity.getRank();
        this.isMultilingual= entity.isMultilingual();
    }

}

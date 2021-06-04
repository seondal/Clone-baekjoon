package com.efub.clone.acmicpc.domain.problem;

import com.efub.clone.acmicpc.domain.BaseTimeEntity;
import com.efub.clone.acmicpc.domain.board.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
@Table(name="problems")
public class Problem extends BaseTimeEntity {
    @Id
    @Column(name = "problem_id", nullable = false)
    private Long id;

    @Column(name = "problem_title", nullable = false)
    private String title;

    @Column(name = "problem_content", columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String input_condition;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String output_condition;

    @Column(name = "multilingual_flag", nullable = false)
    private boolean isMultilingual = false;

    @Column(name = "problem_rank", nullable = false)
    private Long rank;

    @Builder
    public Problem(String title, String content, String input_condition, String output_condition, boolean isMultilingual, Long rank){
        this.title = title;
        this.content = content;
        this.input_condition = input_condition;
        this.output_condition = output_condition;
        this.isMultilingual = isMultilingual;
        this.rank = rank;
    }
}

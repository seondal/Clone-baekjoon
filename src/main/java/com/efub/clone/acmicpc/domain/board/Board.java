package com.efub.clone.acmicpc.domain.board;

import com.efub.clone.acmicpc.domain.BaseTimeEntity;
import com.efub.clone.acmicpc.domain.problem.Problem;
import com.efub.clone.acmicpc.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "Boards")
public class Board extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id", nullable = false)
    private Long id;

    @Column(name = "board_title", nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "problem_id")
    private Problem problem;

    @Column(length = 20, nullable = false)
    private String category;

    @Column(name = "board_content", columnDefinition = "TEXT", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "writer")
    private User user;

    @Builder
    private Board(String title, String category, String content){
        this.title = title;
        this.category = category;
        this.content = content;
    }
}

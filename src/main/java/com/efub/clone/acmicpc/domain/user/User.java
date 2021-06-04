package com.efub.clone.acmicpc.domain.user;

import com.efub.clone.acmicpc.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Builder
@Entity
@Table(name="users")
public class User extends BaseTimeEntity {

    @Id
    @Column(name = "user_id", length = 20, nullable = false)
    private String id;

    @Column(name = "password", length = 20, nullable = false)
    private String password;

    @Column
    private String introduce;

    @Column(name = "user_rank", nullable = false)
    private Long rank;

    @Column(name = "admin_flag", nullable = false)
    @Builder.Default
    private boolean isAdmin = false;

    private Long solveNum;

    @Builder
    public User(String id, String password, String introduce, Long rank, boolean isAdmin){
        this.id = id;
        this.password = password;
        this.introduce = introduce;
        this.rank = rank;
        this.isAdmin = isAdmin;
    }

    public void setSolveNum(Long solveNum) {
        this.solveNum = solveNum;
    }
}

package com.efub.clone.acmicpc.domain.board;

import com.efub.clone.acmicpc.domain.problem.Problem;
import com.efub.clone.acmicpc.domain.user.User;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;

//    @AfterEach
//    public void tearDown(){
//        boardRepository.deleteAll();
//    }

    @Test
    public void 데이터읽기테스트(){
        //given
        Long board_id = Long.valueOf(1);
        Long problem_id = Long.valueOf(1);
        String user_id = "testid";

        //when
        Board board = boardRepository.getById(board_id);

        //then
        assertThat(board.getUser().getId()).isEqualTo(user_id);
        assertThat(board.getProblem().getId()).isEqualTo(problem_id);
    }

}
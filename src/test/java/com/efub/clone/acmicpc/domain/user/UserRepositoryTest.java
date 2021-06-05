package com.efub.clone.acmicpc.domain.user;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

//    @AfterEach
//    public void tearDown(){
//        userRepository.deleteAll();
//    }

    @Test
    public void 데이터주입테스트(){
        //given
        String id = "testid2";
        String pw = "testpassword2";

        User entity = User.builder()
                .id(id)
                .password(pw)
                .rank(Long.valueOf(12))
                .isAdmin(true)
                .build();

        //when
        User user = userRepository.save(entity);

        //then
        assertThat(user.getId()).isEqualTo(id);
        assertThat(user.getPassword()).isEqualTo(pw);
    }

    @Test
    public void 데이터읽기테스트(){
        //given
        String id = "testid";
        String pw = "testpw";

        userRepository.save(User.builder()
                .id(id)
                .password(pw)
                .rank(Long.valueOf(12))
                .isAdmin(true)
                .build());

        //when
        List<User> users = userRepository.findAll();

        //then
        User user = users.get(0);
        assertThat(user.getId()).isEqualTo(id);
        assertThat(user.getPassword()).isEqualTo(pw);
    }
}
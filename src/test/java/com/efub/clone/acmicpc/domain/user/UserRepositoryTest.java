package com.efub.clone.acmicpc.domain.user;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.List;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void 데이터주입테스트(){
        User entity = User.builder()
                .id("testid")
                .password("testpassword")
                .rank(Long.valueOf(1))
                .build();
        userRepository.save(entity);

        //when
        List<User> Users = userRepository.findAll();

        //then
        User user = Users.get(0);

        System.out.println(">>>>> createDate = "+user.getCreate_date());
    }

}
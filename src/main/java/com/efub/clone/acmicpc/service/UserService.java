package com.efub.clone.acmicpc.service;

import com.efub.clone.acmicpc.domain.user.User;
import com.efub.clone.acmicpc.domain.user.UserRepository;
import com.efub.clone.acmicpc.web.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public UserResponseDto findById(String id){
        User entity = userRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 사용자가 없습니다. id = "+id));

        return new UserResponseDto(entity);
    }
}

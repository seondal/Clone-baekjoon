package com.efub.clone.acmicpc.service;

import com.efub.clone.acmicpc.domain.problem.ProblemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProblemService {
    private final ProblemRepository problemRepository;

}

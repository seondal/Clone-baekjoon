package com.efub.clone.acmicpc.service;

import com.efub.clone.acmicpc.domain.problem.Problem;
import com.efub.clone.acmicpc.domain.problem.ProblemRepository;
import com.efub.clone.acmicpc.web.dto.ProblemListResponseDto;
import com.efub.clone.acmicpc.web.dto.ProblemResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProblemService {
    private final ProblemRepository problemRepository;

    @Transactional(readOnly = true)
    public ProblemResponseDto findById(Long id){
        Problem entity = problemRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 번호의 문제가 없습니다. id = "+id));
        return new ProblemResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<ProblemListResponseDto> findAllSortByRank(Long rank){
        return problemRepository.findAll(Sort.by(String.valueOf(rank))).stream()
                .map(ProblemListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<ProblemListResponseDto> findAllDesc(){
        return problemRepository.findAllDesc().stream()
                .map(ProblemListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<ProblemListResponseDto> findMultilingualDesc(){
        return problemRepository.findMultilingualDesc().stream()
                .map(ProblemListResponseDto::new)
                .collect(Collectors.toList());
    }

}

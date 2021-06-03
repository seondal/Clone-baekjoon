package com.efub.clone.acmicpc.web;

import com.efub.clone.acmicpc.domain.problem.Problem;
import com.efub.clone.acmicpc.service.ProblemService;
import com.efub.clone.acmicpc.web.dto.ProblemListResponseDto;
import com.efub.clone.acmicpc.web.dto.ProblemResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProblemController {
    public final ProblemService problemService;

    @GetMapping("/problem/{id}")
    public ProblemResponseDto findById(@PathVariable Long id){
        return problemService.findById(id);
    }

    @GetMapping("/problem/added")
    public List<ProblemListResponseDto> findAllDesc(){
        return problemService.findAllDesc();
    }

    @GetMapping("/problem/sort/{sort_by}")
    public List<ProblemListResponseDto> findAllBy(@PathVariable String sort_by){
        return problemService.findAllBy(sort_by);
    }

    @GetMapping("/problem/added/1")
    public List<ProblemListResponseDto> findMultilingualDesc(){
        return problemService.findMultilingualDesc();
    }
}

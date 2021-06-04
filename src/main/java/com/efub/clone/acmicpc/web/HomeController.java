package com.efub.clone.acmicpc.web;

import com.efub.clone.acmicpc.service.BoardService;
import com.efub.clone.acmicpc.service.ProblemService;
import com.efub.clone.acmicpc.service.UserService;
import com.efub.clone.acmicpc.web.dto.BoardListResponseDto;
import com.efub.clone.acmicpc.web.dto.ProblemListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class HomeController {
    public final UserService userService;
    public final BoardService boardService;
    public final ProblemService problemService;

    @GetMapping("/home1")
    public List<BoardListResponseDto> board_findAllDesc() { return boardService.findAllDesc(); }

    @GetMapping("/home2")
    public List<ProblemListResponseDto> problem_findAllDesc() { return problemService.findAllDesc(); }

    @GetMapping("/home3")
    public List<ProblemListResponseDto> findMultilingual() { return problemService.findMultilingualDesc(); }

    @GetMapping("/home4")
    public List<ProblemListResponseDto> findAllSortByRank(){
        return problemService.findAllSortByRank();
    }

}
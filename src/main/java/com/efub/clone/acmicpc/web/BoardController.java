package com.efub.clone.acmicpc.web;

import com.efub.clone.acmicpc.service.BoardService;
import com.efub.clone.acmicpc.web.dto.BoardListResponseDto;
import com.efub.clone.acmicpc.web.dto.BoardResponseDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/board/{id}")
    public BoardResponseDto findById(@PathVariable Long id){
        return boardService.findById(id);
    }

    @GetMapping("/board/list/all")
    public List<BoardListResponseDto>findAll(){
        return boardService.findAllDesc();
    }

}

package com.efub.clone.acmicpc.service;

import com.efub.clone.acmicpc.domain.board.Board;
import com.efub.clone.acmicpc.domain.board.BoardRepository;
import com.efub.clone.acmicpc.web.dto.BoardListResponseDto;
import com.efub.clone.acmicpc.web.dto.BoardResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public BoardResponseDto findById(Long id){
        Board board = boardRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글이 없습니다. id = "+id));
        return new BoardResponseDto(board);
    }

    @Transactional(readOnly = true)
    public List<BoardListResponseDto> findAllDesc(){
        return boardRepository.findAllDesc().stream()
                .map(BoardListResponseDto::new)
                .collect(Collectors.toList());
    }
}
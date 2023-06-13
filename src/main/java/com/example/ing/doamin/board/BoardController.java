package com.example.ing.doamin.board;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private class BoardController {
        private final BoardService boardService;

        @PostMapping("/board")
        public Long create(@RequestBody BoardCreateRequestDto requestDto) {
            return boardService.create(requestDto);
        }

        @PutMapping("/board/[id]")
        public Long update(@pathVariable Long id, @RequestBody BoardUpdateRequestDto requestDto) {
            
        }
    }
}

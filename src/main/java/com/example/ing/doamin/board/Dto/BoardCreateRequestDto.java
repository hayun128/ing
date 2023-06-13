package com.example.ing.doamin.board.Dto;

import com.example.ing.doamin.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardCreateRrquestDto {
    private Member member;
    private String title;
    }
}

package com.example.sparta.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class MemberRequestDto {
    private Long id;
    private String name;
    private String email;
    private String pw;
}

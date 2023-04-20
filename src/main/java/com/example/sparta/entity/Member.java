package com.example.sparta.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    public Member(MemberRequestDto memberRequestDto) {
        this.id = memberRequestDto.getId();
        this.name = memberRequestDto.getName();
        this.email = memberRequestDto.getEmail();
        this.password = memberRequestDto.getPassword();

    }
}

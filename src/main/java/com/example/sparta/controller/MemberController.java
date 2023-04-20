package com.example.sparta.controller;

import lombok.RequiredArgsConstructor;

import com.example.sparta.service.MemberService;
import com.example.sparta.entity.MemberResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/member/{id}")
    public MemberResponseDto getMemberInfo(@RequestParam Long id) {
        return memberService.findMember(id);
    }

    @GetMapping("/member")
    public List<MemberResponseDto> getMemberList() {
        return memberService.findAllMember();
    }

}
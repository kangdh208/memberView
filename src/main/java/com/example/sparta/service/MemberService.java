package com.example.sparta.service;

import com.example.sparta.entity.MemberResponseDto;
import com.example.sparta.entity.Member;
import com.example.sparta.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberResponseDto findMember(Long id) {
        Member member = memberRepository.findById(id).orElseThrow(
                () -> new NullPointerException("NO SUCH MEMBER!")
        );
        return new MemberResponseDto(member);
    }

    public List<MemberResponseDto> findAllMember() {
        List<Member> members = memberRepository.findAll();
        List<MemberResponseDto> memberResponseDto = new ArrayList<>();
        for (Member member: members) {
            MemberResponseDto memberResponseDtos = new MemberResponseDto(member);
            memberResponseDto.add(memberResponseDtos);
        }
        return memberResponseDto;
    }

}
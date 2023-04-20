package com.example.sparta.repository;

import com.example.sparta.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>{
    List<Member> findAll();
}

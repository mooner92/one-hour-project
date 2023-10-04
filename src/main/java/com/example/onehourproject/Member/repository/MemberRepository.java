package com.example.onehourproject.Member.repository;

import com.example.onehourproject.Member.repository.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

}

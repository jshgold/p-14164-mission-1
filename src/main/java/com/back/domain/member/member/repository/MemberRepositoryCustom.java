package com.back.domain.member.member.repository;

import com.back.domain.member.member.entity.Member;

import java.util.Optional;

interface MemberRepositoryCustom {
    Member findQById(Integer id);
    Member findQByUsername(String name);
    Long qCount();
}
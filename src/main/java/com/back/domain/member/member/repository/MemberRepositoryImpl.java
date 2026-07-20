package com.back.domain.member.member.repository;

import com.back.domain.member.member.entity.Member;
import com.back.domain.member.member.entity.QMember;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
class MemberRepositoryImpl implements MemberRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    public Member findQById(Integer id) {
        QMember member = QMember.member;
        return queryFactory
                .select(member)
                .from(member)
                .where(member.id.eq(id))
                .fetchOne();
    }

    public Member findQByUsername(String username) {
        QMember member = QMember.member;
        return queryFactory
                .select(member)
                .from(member)
                .where(member.username.eq(username))
                .fetchOne();
    }

    public Long qCount() {
        QMember member = QMember.member;
        return queryFactory
                .select(member.count())
                .from(member)
                .fetchOne();
    }
}
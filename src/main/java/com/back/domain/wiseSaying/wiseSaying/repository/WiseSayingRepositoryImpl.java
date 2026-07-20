package com.back.domain.wiseSaying.wiseSaying.repository;

import com.back.domain.wiseSaying.wiseSaying.entity.QWiseSaying;
import com.back.domain.wiseSaying.wiseSaying.entity.WiseSaying;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import java.util.List;

@RequiredArgsConstructor
class WiseSayingRepositoryImpl implements WiseSayingRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    public Long qCount() {
        QWiseSaying wiseSaying = QWiseSaying.wiseSaying;
        return queryFactory
                .select(wiseSaying.count())
                .from(wiseSaying)
                .fetchOne();
    }

    public WiseSaying findQById(Integer id) {
        QWiseSaying wiseSaying = QWiseSaying.wiseSaying;
        return queryFactory
                .select(wiseSaying)
                .from(wiseSaying)
                .where(wiseSaying.id.eq(id))
                .fetchOne();
    }

    public List<WiseSaying> findQAll() {
        QWiseSaying wiseSaying = QWiseSaying.wiseSaying;
        return queryFactory
                .select(wiseSaying)
                .from(wiseSaying)
                .fetch();
    }
}
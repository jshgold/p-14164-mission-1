package com.back.domain.wiseSaying.wiseSaying.repository;

import com.back.domain.wiseSaying.wiseSaying.entity.WiseSaying;

import java.util.List;

interface WiseSayingRepositoryCustom {
    List<WiseSaying> findQAll();
    Long qCount();
    WiseSaying findQById(Integer id);
}
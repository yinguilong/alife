package com.aglife.yin.service;

import com.aglife.yin.pojo.ALife;

import java.util.List;

public interface ALifeService {
    List<ALife> findAll();
    ALife  insert(ALife a);
    ALife findOne(String id);
}

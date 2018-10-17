package com.aglife.yin.service;

import com.aglife.yin.pojo.ALife;
import com.aglife.yin.repository.ALifeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.security.AlgorithmConstraints;
import java.util.List;
import java.util.Optional;

@Service
public class ALifeServiceImpl implements ALifeService {
    @Autowired
    private ALifeRepository aLifeRepository;

    @Override
    public List<ALife> findAll() {
        return aLifeRepository.findAll();
    }

    @Override
    public ALife insert(ALife a) {
        return aLifeRepository.insert(a);
    }

    @Override
    public ALife findOne(String id) {
        Optional<ALife> oa = aLifeRepository.findById(id);
        if (oa.isPresent())
            return oa.get();
        return null;
    }
}

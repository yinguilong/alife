package com.aglife.yin.repository;

import com.aglife.yin.pojo.ALife;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ALifeRepository extends MongoRepository<ALife, String> {
}

package com.aglife.yin.repository;

import com.aglife.yin.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findByParentId(String parentId);
}

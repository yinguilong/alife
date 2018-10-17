package com.aglife.yin.service;

import com.aglife.yin.pojo.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAll(String parentId);
    Comment  insert(Comment a);
    Comment findOne(String id);
}

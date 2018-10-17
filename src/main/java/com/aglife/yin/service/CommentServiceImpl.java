package com.aglife.yin.service;

import com.aglife.yin.pojo.Comment;
import com.aglife.yin.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements   CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Override
    public List<Comment> findAll(String parentId) {
        return  commentRepository.findByParentId(parentId);

    }

    @Override
    public Comment insert(Comment a) {
        return commentRepository.insert(a);
    }

    @Override
    public Comment findOne(String id) {
        Optional<Comment> oc= commentRepository.findById(id);
        if (oc.isPresent())
            return oc.get();
        return null;
    }
}


package com.example.cinema.service;

import com.example.cinema.entity.Comment;

import java.util.List;

public interface CommentService {

    public Comment getComment(Long id);
    public List<Comment> getAllComment();
    public Comment createComment(Comment comment);
    public Comment updateComment(Long id, Comment comment);
    public void deleteComment(Long id);
}

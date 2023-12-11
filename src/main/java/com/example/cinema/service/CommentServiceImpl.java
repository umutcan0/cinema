package com.example.cinema.service;

import com.example.cinema.entity.Comment;
import com.example.cinema.exception.CommentNotFoundException;
import com.example.cinema.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment getComment(Long id){
        return commentRepository.findById(id).orElseThrow(() ->{
            throw new CommentNotFoundException("Comment mevcut değil", id);
        });
    }

    @Override
    public List<Comment> getAllComment() {
        return commentRepository.findAll();
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Long id, Comment comment){
        Comment existingComment = commentRepository.findById(id).orElseThrow(() ->
                new CommentNotFoundException("Comment bulunamadı", id));

        existingComment.setDescription(comment.getDescription());

        return commentRepository.save(existingComment);
    }

    @Override
    public void deleteComment(Long id){
        commentRepository.deleteById(id);
    }

}

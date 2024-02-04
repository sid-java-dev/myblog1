package com.blog.myblog1.service;

import com.blog.myblog1.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto, long postId);

    List<CommentDto> getAllComment();

    void deleteComment(long id);

    CommentDto updateComment(long id, CommentDto commentDto, long postId);
}

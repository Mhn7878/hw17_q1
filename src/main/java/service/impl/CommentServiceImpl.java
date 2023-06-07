package service.impl;

import Repository.CommentRepository;
import Repository.TweetRepository;
import base.service.impl.BaseServiceImpl;
import entitty.Comment;
import entitty.Tweet;

public class CommentServiceImpl extends BaseServiceImpl<Comment, Long, CommentRepository> {
    public CommentServiceImpl(CommentRepository repository) {
        super(repository);
    }
}

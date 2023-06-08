package service.impl;

import Repository.CommentRepository;
import Repository.TweetRepository;
import base.service.impl.BaseServiceImpl;
import entitty.Comment;
import entitty.Tweet;
import service.CommentService;

public class CommentServiceImpl extends BaseServiceImpl<Comment, Long, CommentRepository>
        implements CommentService {
    public CommentServiceImpl(CommentRepository repository) {
        super(repository);
    }
}

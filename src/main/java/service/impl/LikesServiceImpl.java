package service.impl;

import Repository.CommentRepository;
import Repository.impl.LikesRepository;
import base.service.impl.BaseServiceImpl;
import entitty.Comment;
import entitty.Likes;

public class LikesServiceImpl extends BaseServiceImpl<Likes, Long, LikesRepository> {
    public LikesServiceImpl(LikesRepository repository) {
        super(repository);
    }
}

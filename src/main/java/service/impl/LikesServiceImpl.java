package service.impl;

import Repository.LikesRepository;
import base.service.impl.BaseServiceImpl;
import entitty.Likes;

public class LikesServiceImpl extends BaseServiceImpl<Likes, Long, LikesRepository> {
    public LikesServiceImpl(LikesRepository repository) {
        super(repository);
    }
}

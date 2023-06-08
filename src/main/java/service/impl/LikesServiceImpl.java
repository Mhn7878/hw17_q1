package service.impl;

import Repository.LikesRepository;
import base.service.impl.BaseServiceImpl;
import entitty.Likes;
import service.LikesService;

public class LikesServiceImpl extends BaseServiceImpl<Likes, Long, LikesRepository>
        implements LikesService {
    public LikesServiceImpl(LikesRepository repository) {
        super(repository);
    }
}

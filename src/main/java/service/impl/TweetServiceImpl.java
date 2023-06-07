package service.impl;

import Repository.AccountUserRepository;
import Repository.TweetRepository;
import base.service.impl.BaseServiceImpl;
import entitty.AccountUser;
import entitty.Tweet;

public class TweetServiceImpl extends BaseServiceImpl<Tweet, Long, TweetRepository> {
    public TweetServiceImpl(TweetRepository repository) {
        super(repository);
    }
}

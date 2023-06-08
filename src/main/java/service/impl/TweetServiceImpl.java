package service.impl;

import Repository.AccountUserRepository;
import Repository.TweetRepository;
import base.service.impl.BaseServiceImpl;
import entitty.AccountUser;
import entitty.Likes;
import entitty.Tweet;
import service.TweetService;

import java.util.List;

public class TweetServiceImpl extends BaseServiceImpl<Tweet, Long, TweetRepository>
        implements TweetService {
    public TweetServiceImpl(TweetRepository repository) {
        super(repository);
    }

    @Override
    public void addLikes(Likes likes) {
        repository.addLikes(likes);
    }

    @Override
    public List<Tweet> findByUserAccount(AccountUser accountUser) {
        return repository.findByUserAccount(accountUser);
    }
}

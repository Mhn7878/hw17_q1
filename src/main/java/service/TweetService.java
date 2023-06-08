package service;

import base.service.BaseService;
import entitty.AccountUser;
import entitty.Likes;
import entitty.Tweet;

import java.util.List;

public interface TweetService extends BaseService<Long, Tweet> {
    void addLikes(Likes likes);
    List<Tweet> findByUserAccount(AccountUser accountUser);

}

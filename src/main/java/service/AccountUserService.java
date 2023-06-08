package service;

import base.service.BaseService;
import entitty.AccountUser;
import entitty.Tweet;

import java.util.List;

public interface AccountUserService extends BaseService<Long, AccountUser> {
    AccountUser searchByUserName (String userName);
    void addTweet(Tweet tweet);

}

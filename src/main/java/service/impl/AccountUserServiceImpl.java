package service.impl;

import Repository.AccountUserRepository;
import base.service.impl.BaseServiceImpl;
import entitty.AccountUser;
import entitty.Tweet;
import service.AccountUserService;

public class AccountUserServiceImpl extends BaseServiceImpl<AccountUser, Long, AccountUserRepository>
        implements AccountUserService {

    public AccountUserServiceImpl(AccountUserRepository repository) {
        super(repository);
    }


    @Override
    public AccountUser searchByUserName(String userName) {
        return repository.searchByUserName(userName );
    }

    @Override
    public void addTweet(Tweet tweet) {
         repository.addTweet(tweet);
    }
}

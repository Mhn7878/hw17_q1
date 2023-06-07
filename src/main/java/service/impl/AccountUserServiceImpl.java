package service.impl;

import Repository.AccountUserRepository;
import base.service.impl.BaseServiceImpl;
import entitty.AccountUser;

public class AccountUserServiceImpl extends BaseServiceImpl<AccountUser, Long, AccountUserRepository> {

    public AccountUserServiceImpl(AccountUserRepository repository) {
        super(repository);
    }
}

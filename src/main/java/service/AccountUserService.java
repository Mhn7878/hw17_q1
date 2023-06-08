package service;

import base.service.BaseService;
import entitty.AccountUser;

public interface AccountUserService extends BaseService<Long, AccountUser> {
    AccountUser searchByUserName (String userName);

}

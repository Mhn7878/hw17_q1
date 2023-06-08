package Repository;

import base.repository.BaseRepository;
import entitty.AccountUser;

public interface AccountUserRepository extends BaseRepository< AccountUser,Long> {
    AccountUser searchByUserName (String userName);

}

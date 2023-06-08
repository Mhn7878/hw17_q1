package Repository;

import base.repository.BaseRepository;
import entitty.AccountUser;
import entitty.Tweet;

public interface AccountUserRepository extends BaseRepository< AccountUser,Long> {
    AccountUser searchByUserName (String userName);
    void addTweet(Tweet tweet);


}

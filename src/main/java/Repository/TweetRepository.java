package Repository;

import base.repository.BaseRepository;
import entitty.AccountUser;
import entitty.Likes;
import entitty.Tweet;

import java.util.List;

public interface TweetRepository extends BaseRepository<Tweet,Long> {
    void addLikes(Likes likes);
    List<Tweet> findByUserAccount(AccountUser accountUser);

}

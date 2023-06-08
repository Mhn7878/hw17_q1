package Repository;

import base.repository.BaseRepository;
import entitty.AccountUser;
import entitty.Likes;
import entitty.Tweet;

import java.util.List;
import java.util.Optional;

public interface TweetRepository extends BaseRepository<Tweet,Long> {
    void addLikes(Likes likes);
    List<Tweet> findByUserAccount(AccountUser accountUser);
//    Optional<Tweet> description(String text, Likes likes);

}

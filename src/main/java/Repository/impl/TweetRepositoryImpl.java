package Repository.impl;

import Repository.TweetRepository;
import base.repository.impl.BaseRepositoryImpl;
import entitty.AccountUser;
import entitty.Likes;
import entitty.Tweet;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class TweetRepositoryImpl extends BaseRepositoryImpl<Tweet,Long>
        implements TweetRepository {
    private final EntityManager em;

    public TweetRepositoryImpl(EntityManager em) {
        super(em);
        this.em = em;
    }


    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    public Class<Tweet> getEntityClass() {
        return Tweet.class;
    }


    @Override
    public void addLikes(Likes likes) {
        List<Likes> likes1=new ArrayList<>();
        likes1.add(likes);
        likes.setTweet(new Tweet());
    }

    @Override
    public List<Tweet> findByUserAccount(AccountUser accountUser) {
        return em.createQuery(
                "select t from  Tweet  t where t.accountUser=:AccountUser",Tweet.class
        ).setParameter("AccountUser",accountUser).getResultList();
    }
}

package Repository.impl;

import Repository.TweetRepository;
import base.repository.impl.BaseRepositoryImpl;
import entitty.Tweet;

import javax.persistence.EntityManager;

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
}

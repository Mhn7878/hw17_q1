package Repository.impl;

import Repository.TweetRepository;
import base.repository.impl.BaseRepositoryImpl;
import entitty.AccountUser;
import entitty.Likes;
import entitty.Tweet;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

//    @Override
//    public Optional<Tweet> description(String text, Likes likes) {
//        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
//        CriteriaQuery<Tweet> criteriaQuery = criteriaBuilder.createQuery(Tweet.class);
//        Root<Tweet> root = criteriaQuery.from(Tweet.class);
//        criteriaQuery.select(root);
//        Predicate textPredicate = criteriaBuilder.equal(root.get("text"), text);
//        Predicate countLikePredicate = criteriaBuilder.count(root.get("likes"), likes);
//        Predicate finalPredicate = criteriaBuilder.and(textPredicate, countLikePredicate);
//        criteriaQuery.where(finalPredicate);
//        return Optional.empty();
//    }


}

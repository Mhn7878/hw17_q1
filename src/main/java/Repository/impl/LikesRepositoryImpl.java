package Repository.impl;

import Repository.CommentRepository;
import base.repository.impl.BaseRepositoryImpl;
import entitty.Comment;
import entitty.Likes;

import javax.persistence.EntityManager;

public class LikesRepositoryImpl extends BaseRepositoryImpl<Likes,Long>
        implements LikesRepository {
    private final EntityManager em;

    @Override
    public Class<Likes> getEntityClass() {
        return Likes.class;
    }

    public LikesRepositoryImpl(EntityManager em) {
        super(em);
        this.em = em;
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }


}

package Repository.impl;

import Repository.CommentRepository;
import base.repository.impl.BaseRepositoryImpl;
import entitty.Comment;

import javax.persistence.EntityManager;

public class CommentRepositoryImpl extends BaseRepositoryImpl<Comment,Long>
        implements CommentRepository {
    private final EntityManager em;

    public CommentRepositoryImpl(EntityManager em) {
        super(em);
        this.em = em;
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    public Class<Comment> getEntityClass() {
        return Comment.class;
    }
}

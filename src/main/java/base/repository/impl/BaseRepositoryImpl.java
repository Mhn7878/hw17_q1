package base.repository.impl;

import base.BaseEntity;
import base.repository.BaseRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseRepositoryImpl<T extends BaseEntity<ID>,
        ID extends Serializable> implements BaseRepository<T, ID> {
    protected final EntityManager em;

    public abstract Class<T> getEntityClass();


    public BaseRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public T save(T entity) {
        if (entity.getId() == null) {
            em.persist(entity);
            return entity;
        } else {
            return null;
        }
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(em.find(getEntityClass(), id));
    }


    @Override
    public Boolean remove(T entity) {
        if (entity.getId() != null) {
            em.remove(entity);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<T> findAll() {
        return em.createQuery(
                "from " + getEntityClass().getSimpleName(), getEntityClass()
        ).getResultList();
    }

    @Override
    public T update(T entity) {
        if (entity.getId() != null) {
            em.merge(entity);
            return entity;
        } else {
            return null;
        }
    }
}

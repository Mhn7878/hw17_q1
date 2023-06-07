package base.service.impl;

import base.BaseEntity;
import base.repository.BaseRepository;
import base.service.BaseService;

import javax.persistence.EntityTransaction;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class BaseServiceImpl<T extends BaseEntity<ID>, ID extends Serializable, R extends BaseRepository<T, ID>>
        implements BaseService<ID,T> {
    protected R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        EntityTransaction transaction = repository.getEntityManager().getTransaction();
        transaction.begin();
        entity=repository.save(entity);
        transaction.commit();
        return  entity;
    }

    @Override
    public Optional<T> findById(ID id) {
        Optional<T> optionalENTITY = repository.findById(id);
        return optionalENTITY;
    }

    @Override
    public Boolean remove(T entity) {
        EntityTransaction transaction = repository.getEntityManager().getTransaction();
        transaction.begin();
        repository.remove(entity);
        transaction.commit();
        return  true;
    }

    @Override
    public List<T> findAll() {
        List<T> entities = repository.findAll();
        return  entities;
    }

    @Override
    public T update(T entity) {
        EntityTransaction transaction = repository.getEntityManager().getTransaction();
        transaction.begin();
       entity= repository.update(entity);
        transaction.commit();
        return entity;
    }
}

package base.service;

import base.BaseEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService<ID extends Serializable, T extends BaseEntity<ID>>{
    T save(T entity);

    Optional<T> findById(ID id);

    Boolean remove(T entity);

    List<T> findAll();

    T update(T entity);

    long count();

}

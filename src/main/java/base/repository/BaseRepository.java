package base.repository;

import base.BaseEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseRepository <T extends BaseEntity<ID>, ID extends Serializable>{
    T save(T entity);

    Optional<T> findById(ID id);

    Boolean remove(T entity);

    List<T> findAll();

    T update(T entity);

    EntityManager getEntityManager();

    long count();


}

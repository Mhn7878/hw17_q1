package base.repository.impl;

import base.BaseEntity;
import base.repository.BaseRepository;

import java.io.Serializable;

public class BaseRepositoryImpl <T extends BaseEntity<ID>,
        ID extends Serializable> implements BaseRepository<T, ID> {
}

package Repository.impl;

import Repository.AccountUserRepository;
import base.repository.impl.BaseRepositoryImpl;
import entitty.AccountUser;

import javax.persistence.EntityManager;

public class AccountUserRepositoryImpl extends BaseRepositoryImpl< AccountUser,Long>
        implements AccountUserRepository {
    private final EntityManager em;

    public AccountUserRepositoryImpl(EntityManager em) {
        super(em);
        this.em = em;
    }

    @Override
    public Class<AccountUser> getEntityClass() {
        return AccountUser.class;
    }





    @Override
    public EntityManager getEntityManager() {
        return em;
    }


    @Override
    public AccountUser searchByUserName(String userName) {
        return em.createQuery("select  a from AccountUser as a  where a.userName=:userName"
                        ,AccountUser.class).setParameter("userName",userName).getSingleResult();
    }
}

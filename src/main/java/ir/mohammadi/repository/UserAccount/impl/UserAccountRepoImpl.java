package ir.mohammadi.repository.UserAccount.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.UserAccount;
import ir.mohammadi.repository.UserAccount.UserAccountRepo;
import jakarta.persistence.EntityManager;

public class UserAccountRepoImpl extends BaseRepositoryImpl<UserAccount> implements UserAccountRepo {
    public UserAccountRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<UserAccount> getEntityClass() {
        return UserAccount.class;
    }
}

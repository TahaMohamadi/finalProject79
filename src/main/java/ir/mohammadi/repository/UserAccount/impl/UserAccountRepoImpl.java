package ir.mohammadi.repository.UserAccount.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.UserAccount;
import ir.mohammadi.repository.UserAccount.UserAccountRepo;
import ir.mohammadi.util.Hibernate;
import jakarta.persistence.EntityManager;

import java.util.List;

public class UserAccountRepoImpl extends BaseRepositoryImpl<UserAccount> implements UserAccountRepo {
    public UserAccountRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<UserAccount> getEntityClass() {
        return UserAccount.class;
    }

    @Override
    public UserAccount ChangePassword(String username, String password) {
        String jpql = """
                UPDATE UserAccount u
                SET u.password = :password
                WHERE u.username = :username
                """;
        return (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, UserAccount.class).setParameter("password", password).setParameter("username", username)).getSingleResult();
    }

    @Override
    public Boolean CheckUsername(String username) {
        String jpql = """
                SELECT U FROM UserAccount u
                WHERE u.username = :username
                """;
        List<UserAccount> userAccount = (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, UserAccount.class).setParameter("username", username)).getResultList();
        Boolean check;
        if (userAccount.isEmpty()){
            return true;
        } else {
            return false;
        }
    }



    @Override
    public Boolean EmailValidation(String email) {
        String jpql = """
                SELECT U FROM UserAccount u
                WHERE u.email = :email
                """;
        List<UserAccount> userAccount = (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, UserAccount.class).setParameter("email", email)).getResultList();
        Boolean check;
        if (userAccount.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}

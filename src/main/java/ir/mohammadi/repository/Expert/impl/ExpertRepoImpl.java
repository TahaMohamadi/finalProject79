package ir.mohammadi.repository.Expert.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Expert;
import ir.mohammadi.entity.UserAccount;
import ir.mohammadi.repository.Expert.ExpertRepo;
import ir.mohammadi.util.Hibernate;
import jakarta.persistence.EntityManager;

public class ExpertRepoImpl extends BaseRepositoryImpl<Expert> implements ExpertRepo {
    public ExpertRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Expert> getEntityClass() {
        return Expert.class;
    }

    @Override
    public Expert ChangeStatus(Expert expert, Boolean isAvailable) {
        String jpql = """
                UPDATE Expert u
                SET u.expertStatus = :isAvailable
                WHERE u.id = :expertId
                """;
        return (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, Expert.class).setParameter("isAvailable", isAvailable).setParameter("expertId", expert.getId())).getSingleResult();
    }
}

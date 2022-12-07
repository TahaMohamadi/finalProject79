package ir.mohammadi.repository.ExpertService.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Expert;
import ir.mohammadi.entity.ExpertService;
import ir.mohammadi.entity.Service;
import ir.mohammadi.entity.UserAccount;
import ir.mohammadi.repository.ExpertService.ExpertServiceRepo;
import ir.mohammadi.util.Hibernate;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ExpertServiceRepoImpl extends BaseRepositoryImpl<ExpertService> implements ExpertServiceRepo {
    public ExpertServiceRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<ExpertService> getEntityClass() {
        return ExpertService.class;
    }

    @Override
    public List<ExpertService> FindByExpert(Expert expert) {
        String jpql = """
                SELECT e FROM ExpertService e
                WHERE e.expert = :expert
                """;
        return  (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, ExpertService.class).setParameter("expert", expert)).getResultList();
    }

    @Override
    public List<ExpertService> FindByService(Service service) {
        String jpql = """
                SELECT e FROM ExpertService e
                WHERE e.service = :service
                """;
        return  (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, ExpertService.class).setParameter("service", service)).getResultList();
    }

    @Override
    public ExpertService changeStatus(Expert expert, Service service, Boolean isAvailable) {
        String jpql = """
                UPDATE ExpertService e
                SET e.isAvailable = :isAvailable
                WHERE (e.service = :service) and (e.expert = :expert) 
                """;
        return (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, ExpertService.class).setParameter("service", service).setParameter("expert", expert)).setParameter("isAvailable",isAvailable).getSingleResult();
    }
}

package ir.mohammadi.repository.Service.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.ExpertService;
import ir.mohammadi.entity.Order;
import ir.mohammadi.entity.Service;
import ir.mohammadi.repository.Service.ServiceRepo;
import ir.mohammadi.util.Hibernate;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ServiceRepoImpl extends BaseRepositoryImpl<Service> implements ServiceRepo {
    public ServiceRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Service> getEntityClass() {
        return Service.class;
    }
//criteria
    @Override
    public Service EditSubService(String description, Long basePrice, Service service) {
        String jpql = """
                UPDATE Service s
                SET s.description = :description, s.basePrice = :basePrice
                WHERE s.id = :serviceId 
                """;
        return (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, Service.class).setParameter("description", description).setParameter("basePrice", basePrice).setParameter("serviceId", service.getId())).getSingleResult();
    }
    @Override
    public Service EditSubPriceService(Long basePrice, Service service) {
        String jpql = """
                UPDATE Service s
                set s.basePrice = :basePrice
                WHERE s.id = :serviceId 
                """;
        return (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, Service.class).setParameter("basePrice", basePrice).setParameter("serviceId", service.getId())).getSingleResult();
    }

    @Override
    public Boolean CheckService(String name) {
        String jpql = """
                SELECT s FROM Service s
                WHERE s.name = :name
                """;
        List<Service> services = (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, Service.class).setParameter("name", name)).getResultList();
        if (services.isEmpty()){
            return true;

        } else {
            return false;
        }
    }

    @Override
    public List<Service> getSubServices(Service service) {
        String jpql = """
                SELECT s FROM Service s
                WHERE s.parent = :service
                """;
        return  (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, Service.class).setParameter("service", service)).getResultList();
    }

    @Override
    public Service EditSubDescService(String description, Service service) {
        String jpql = """
                UPDATE Service s
                Set s.description = :description
                WHERE s.id = :serviceId 
                """;
        return (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, Service.class).setParameter("description", description).setParameter("serviceId", service.getId())).getSingleResult();
    }

    @Override
    public List<Service> getMainServices() {
        String jpql = """
                SELECT s FROM Service s
                WHERE s.parent = :null
                """;
        return  (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, Service.class).setParameter("null", null)).getResultList();
    }

    @Override
    public Boolean nameCheck(String name) {
        String jpql = """
                SELECT s FROM Service s
                WHERE s.name = :name
                """;
        List<Service> s =  (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, Service.class).setParameter("name", name)).getResultList();
        if (s.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}

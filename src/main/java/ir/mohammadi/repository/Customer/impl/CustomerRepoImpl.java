package ir.mohammadi.repository.Customer.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Customer;
import ir.mohammadi.entity.Service;
import ir.mohammadi.repository.Customer.CustomerRepo;
import ir.mohammadi.repository.Service.impl.ServiceRepoImpl;
import ir.mohammadi.service.Service.ServiceServ;
import ir.mohammadi.service.Service.impl.ServiceServImpl;
import ir.mohammadi.util.Hibernate;
import jakarta.persistence.EntityManager;

import java.util.List;

public class CustomerRepoImpl extends BaseRepositoryImpl<Customer> implements CustomerRepo {
    ServiceServ serviceServ = new ServiceServImpl(new ServiceRepoImpl(Hibernate.getEntityManagerFactory().createEntityManager()));
    public CustomerRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Customer> getEntityClass() {
        return Customer.class;
    }

    @Override
    public List<Service> LoadMainServices() {
        return serviceServ.getMainServices();
    }

    @Override
    public List<Service> LoadSubServices(Service service) {
        return serviceServ.getSubServices(service);
    }
}

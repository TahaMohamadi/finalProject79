package ir.mohammadi.repository.Service.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Service;
import ir.mohammadi.repository.Service.ServiceRepo;
import jakarta.persistence.EntityManager;

public class ServiceRepoImpl extends BaseRepositoryImpl<Service> implements ServiceRepo {
    public ServiceRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Service> getEntityClass() {
        return Service.class;
    }
}

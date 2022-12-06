package ir.mohammadi.repository.Customer.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Customer;
import ir.mohammadi.repository.Customer.CustomerRepo;
import jakarta.persistence.EntityManager;

public class CustomerRepoImpl extends BaseRepositoryImpl<Customer> implements CustomerRepo {
    public CustomerRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Customer> getEntityClass() {
        return Customer.class;
    }
}

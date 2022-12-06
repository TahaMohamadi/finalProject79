package ir.mohammadi.service.Customer.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Customer;
import ir.mohammadi.repository.Customer.CustomerRepo;
import ir.mohammadi.service.Customer.CustomerServ;

public class CustomerServImpl extends BaseServiceImpl<Customer, CustomerRepo> implements CustomerServ {
    public CustomerServImpl(CustomerRepo repository) {
        super(repository);
    }
}

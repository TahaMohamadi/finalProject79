package ir.mohammadi.service.Customer.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Customer;
import ir.mohammadi.repository.Customer.CustomerRepo;
import ir.mohammadi.repository.Service.impl.ServiceRepoImpl;
import ir.mohammadi.service.Customer.CustomerServ;
import ir.mohammadi.service.Service.ServiceServ;
import ir.mohammadi.service.Service.impl.ServiceServImpl;
import ir.mohammadi.util.Hibernate;

import java.util.regex.Pattern;

public class CustomerServImpl extends BaseServiceImpl<Customer, CustomerRepo> implements CustomerServ {
    public CustomerServImpl(CustomerRepo repository) {
        super(repository);
    }
    ServiceServ serviceServ = new ServiceServImpl(new ServiceRepoImpl(Hibernate.getEntityManagerFactory().createEntityManager()));
//    load main and sub
//    create order + desc + set status waitingExpertOffer
//

}
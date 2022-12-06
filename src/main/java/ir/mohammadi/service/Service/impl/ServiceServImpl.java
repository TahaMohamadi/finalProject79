package ir.mohammadi.service.Service.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Service;
import ir.mohammadi.repository.Service.ServiceRepo;
import ir.mohammadi.service.Service.ServiceServ;

public class ServiceServImpl extends BaseServiceImpl<Service, ServiceRepo> implements ServiceServ {
    public ServiceServImpl(ServiceRepo repository) {
        super(repository);
    }
}

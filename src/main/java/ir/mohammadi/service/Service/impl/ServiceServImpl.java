package ir.mohammadi.service.Service.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Service;
import ir.mohammadi.repository.Service.ServiceRepo;
import ir.mohammadi.service.Service.ServiceServ;

public class ServiceServImpl extends BaseServiceImpl<Service, ServiceRepo> implements ServiceServ {
    public ServiceServImpl(ServiceRepo repository) {
        super(repository);
    }

    @Override
    public Service AddMainService(String name) {
        return null;
    }

    @Override
    public Service AddSubService(String name, String description, Long basePrice, Service parent) {
        return null;
    }

    @Override
    public Service EditSubService(String description, Long basePrice, Service service) {
        return null;
    }

    @Override
    public Service EditSubService(Long basePrice, Service service) {
        return null;
    }

    @Override
    public Service EditSubService(String description, Service service) {
        return null;
    }

    @Override
    public Boolean CheckService(String name) {
        return null;
    }
}

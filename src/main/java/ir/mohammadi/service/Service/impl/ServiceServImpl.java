package ir.mohammadi.service.Service.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Service;
import ir.mohammadi.exceptions.CantFindSubService;
import ir.mohammadi.exceptions.InvalidServiceCheck;
import ir.mohammadi.repository.Service.ServiceRepo;
import ir.mohammadi.service.Service.ServiceServ;

import java.util.List;

public class ServiceServImpl extends BaseServiceImpl<Service, ServiceRepo> implements ServiceServ {
    public ServiceServImpl(ServiceRepo repository) {
        super(repository);
    }


    @Override
    public Service EditSubService(String description, Long basePrice, Service service) {
        try{
            return repository.EditSubService(description,basePrice,service);
        } catch (Exception e) {
            throw new CantFindSubService("cant find sub service");
        }    }

    @Override
    public Service EditSubPriceService(Long basePrice, Service service) {
        try{
            return repository.EditSubPriceService(basePrice,service);
        } catch (Exception e) {
            throw new CantFindSubService("cant find sub service");
        }    }

    @Override
    public Service EditSubDescService(String description, Service service) {
        try{
            return repository.EditSubDescService(description,service);
        } catch (Exception e) {
            throw new CantFindSubService("cant find sub service");
        }    }

    @Override
    public Boolean CheckService(String name) {
        try{
            return repository.CheckService(name);
        } catch (Exception e) {
            throw new InvalidServiceCheck("invalid check service");
        }    }

    @Override
    public List<Service> getMainServices() {
        try{
            return repository.getMainServices();
        } catch (Exception e) {
            throw new InvalidServiceCheck("cant load main service");
        }    }

    @Override
    public List<Service> getSubServices(Service service) {
        try{
            return repository.getSubServices(service);
        } catch (Exception e) {
            throw new InvalidServiceCheck("cant load sub service");
        }
    }

    @Override
    public Boolean nameCheck(String name) {
        try{
            return repository.nameCheck(name);
        } catch (Exception e) {
            throw new InvalidServiceCheck("cant check name service");
        }
    }
}

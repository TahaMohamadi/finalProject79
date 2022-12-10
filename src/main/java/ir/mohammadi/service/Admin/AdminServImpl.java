package ir.mohammadi.service.Admin;

import ir.mohammadi.entity.Expert;
import ir.mohammadi.entity.ExpertService;
import ir.mohammadi.entity.Service;
import ir.mohammadi.entity.enums.ExpertStatus;
import ir.mohammadi.exceptions.ExpertServiceException;
import ir.mohammadi.exceptions.NotFoundService;
import ir.mohammadi.exceptions.ServiceIsExist;
import ir.mohammadi.repository.Expert.impl.ExpertRepoImpl;
import ir.mohammadi.repository.ExpertService.impl.ExpertServiceRepoImpl;
import ir.mohammadi.repository.Service.impl.ServiceRepoImpl;
import ir.mohammadi.service.Expert.ExpertServ;
import ir.mohammadi.service.Expert.impl.ExpertServImpl;
import ir.mohammadi.service.ExpertService.ExpertServiceServ;
import ir.mohammadi.service.ExpertService.impl.ExpertServiceServImpl;
import ir.mohammadi.service.Service.ServiceServ;
import ir.mohammadi.service.Service.impl.ServiceServImpl;
import ir.mohammadi.util.Hibernate;

import java.util.List;
import java.util.Optional;

public class AdminServImpl implements AdminServ{
    private final ServiceServ serviceServ = new ServiceServImpl(new ServiceRepoImpl(Hibernate.getEntityManagerFactory().createEntityManager()));
    private final ExpertServ expertServ = new ExpertServImpl(new ExpertRepoImpl(Hibernate.getEntityManagerFactory().createEntityManager()));
    private final ExpertServiceServ expertServiceServ  = new ExpertServiceServImpl(new ExpertServiceRepoImpl(Hibernate.getEntityManagerFactory().createEntityManager()));
//exception database
    @Override
    public void AddMainService(String name) {
        if(!serviceServ.nameCheck(name)){
            throw new ServiceIsExist("Service is exist");
        }else {
            Service mainsService = new Service();
            mainsService.setName(name);
            serviceServ.save(mainsService);
        }
    }
//kar ba Id
    @Override
    public void AddSubService(String name, Long basePrice, String description, Service service) {
        if (!serviceServ.nameCheck(service.getName())){
            if (serviceServ.nameCheck(name)){
                Service subService = new Service();
                subService.setName(name);
                subService.setDescription(description);
                subService.setBasePrice(basePrice);
                subService.setParent(service);
                serviceServ.save(subService);
            } else {
                throw new ServiceIsExist("SubService is exist");
            }
        }else {
            throw new ServiceIsExist("MainService is not exist");
        }
    }

    @Override
    public void AddExpertToSubService(Service service, Expert expert) {
        try {
            ExpertService expertService = new ExpertService();
            expertService.setExpert(expert);
            expertService.setService(service);
            expertService.setIsAvailable(true);
            expertServiceServ.save(expertService);
        } catch (Exception e){
            throw new ExpertServiceException("cant find Service or expert");
        }
    }

    public void deleteExpertFromSubService(Service service, Expert expert) {
        try {
            ExpertService expertService = expertServiceServ.FindByExpertAndService(expert,service);
        expertService.setIsAvailable(false);
        expertServiceServ.save(expertService);
    } catch (Exception e){
        throw new ExpertServiceException("cant find ExpertService");
    }
    }
    @Override
    public void ActiveExpert(Expert expert) {
        try {
            Expert expert1 = expertServ.findById(expert.getId()).get();
        expert1.setExpertStatus(ExpertStatus.ACCEPTED);
        expertServ.update(expert1);
    } catch (Exception e){
        throw new ExpertServiceException("cant find Expert");
    }
    }
//find all new expert
    @Override
    public void ChangeStatusExpert(Expert expert, ExpertStatus expertStatus) {
        try {
//farakhani az oonvar (logic oonvar)
            Expert expert1 = expertServ.findById(expert.getId()).get();
        expert1.setExpertStatus(ExpertStatus.ACCEPTED);

    } catch (Exception e){
        throw new ExpertServiceException("cant find Expert");
    }
    }
    @Override
    public void EditSubServicePrice(Long BasePrice, Service service) {
        try {
        Service subService = serviceServ.findById(service.getId()).get();
        subService.setBasePrice(BasePrice);
        serviceServ.update(subService);
    } catch (Exception e){
        throw new ExpertServiceException("cant find service");
    }
    }

    @Override
    public void EditSubServiceDescription(String description, Service service) {
        Optional<Service> optionalService = serviceServ.findById(service.getId());
        if (optionalService.isPresent()){
            Service subService = optionalService.get();
            subService.setDescription(description);
            serviceServ.update(subService);
        } else {
            throw new NotFoundService("cant find service");
        }
    }

    @Override
    public void EditSubServiceFull(String description, Service service, Long basePrice) {
        Optional<Service> subServices = serviceServ.findById(service.getId());
        if(subServices.isPresent()) {
            Service subService = subServices.get();
            subService.setDescription(description);
            subService.setBasePrice(basePrice);
            serviceServ.update(subService);
        } else {
            throw new NotFoundService("cant find service");
        }
    }

    @Override
    public List<Service> ShowAllMainService() {
        return serviceServ.getMainServices();
    }

    @Override
    public List<Service> ShowAllSubService(Service service) {
        return serviceServ.getSubServices(service);
    }
}

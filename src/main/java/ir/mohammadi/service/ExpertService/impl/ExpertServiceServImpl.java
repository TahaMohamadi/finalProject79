package ir.mohammadi.service.ExpertService.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Expert;
import ir.mohammadi.entity.ExpertService;
import ir.mohammadi.entity.Service;
import ir.mohammadi.repository.ExpertService.ExpertServiceRepo;
import ir.mohammadi.service.ExpertService.ExpertServiceServ;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ExpertServiceServImpl extends BaseServiceImpl<ExpertService, ExpertServiceRepo> implements ExpertServiceServ {

    public ExpertServiceServImpl(ExpertServiceRepo repository) {
        super(repository);
    }

    @Override
    public List<ExpertService> FindByExpert(Expert expert) {
        try{
            return repository.FindByExpert(expert);
        } catch (Exception e) {
            throw null;
        }
    }

    @Override
    public List<ExpertService> FindByService(Service service) {
        try{
            return repository.FindByService(service);
        } catch (Exception e) {
            throw null;
        }
    }

    @Override
    public ExpertService changeStatus(Expert expert, Service service, Boolean isAvailable) {
        try{
            return repository.changeStatus(expert,service,isAvailable);
        } catch (Exception e) {
            throw null;
        }
    }
}

package ir.mohammadi.service.ExpertService.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.ExpertService;
import ir.mohammadi.repository.ExpertService.ExpertServiceRepo;
import ir.mohammadi.service.ExpertService.ExpertServiceServ;
import jakarta.persistence.EntityManager;

public class ExpertServiceServImpl extends BaseServiceImpl<ExpertService, ExpertServiceRepo> implements ExpertServiceServ {

    public ExpertServiceServImpl(ExpertServiceRepo repository) {
        super(repository);
    }
}

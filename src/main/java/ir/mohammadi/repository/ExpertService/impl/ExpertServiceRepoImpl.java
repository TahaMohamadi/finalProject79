package ir.mohammadi.repository.ExpertService.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.ExpertService;
import ir.mohammadi.repository.ExpertService.ExpertServiceRepo;
import jakarta.persistence.EntityManager;

public class ExpertServiceRepoImpl extends BaseRepositoryImpl<ExpertService> implements ExpertServiceRepo {
    public ExpertServiceRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<ExpertService> getEntityClass() {
        return ExpertService.class;
    }
}

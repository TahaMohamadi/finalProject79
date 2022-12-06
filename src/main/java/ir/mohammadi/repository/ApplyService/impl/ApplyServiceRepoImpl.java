package ir.mohammadi.repository.ApplyService.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.ApplyService;
import ir.mohammadi.repository.ApplyService.ApplyServiceRepo;
import jakarta.persistence.EntityManager;

public class ApplyServiceRepoImpl extends BaseRepositoryImpl<ApplyService> implements ApplyServiceRepo {
    public ApplyServiceRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<ApplyService> getEntityClass() {
        return ApplyService.class;
    }
}

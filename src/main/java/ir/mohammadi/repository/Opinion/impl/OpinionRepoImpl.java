package ir.mohammadi.repository.Opinion.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Opinion;
import ir.mohammadi.repository.Opinion.OpinionRepo;
import jakarta.persistence.EntityManager;

public class OpinionRepoImpl extends BaseRepositoryImpl<Opinion> implements OpinionRepo {
    public OpinionRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Opinion> getEntityClass() {
        return Opinion.class;
    }
}

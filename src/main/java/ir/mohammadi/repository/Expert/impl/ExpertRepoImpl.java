package ir.mohammadi.repository.Expert.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Expert;
import ir.mohammadi.repository.Expert.ExpertRepo;
import jakarta.persistence.EntityManager;

public class ExpertRepoImpl extends BaseRepositoryImpl<Expert> implements ExpertRepo {
    public ExpertRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Expert> getEntityClass() {
        return Expert.class;
    }
}

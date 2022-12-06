package ir.mohammadi.repository.Images.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Images;
import ir.mohammadi.repository.Images.ImagesRepo;
import jakarta.persistence.EntityManager;

public class ImagesRepoImpl extends BaseRepositoryImpl<Images> implements ImagesRepo {
    public ImagesRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Images> getEntityClass() {
        return Images.class;
    }
}

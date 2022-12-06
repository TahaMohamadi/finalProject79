package ir.mohammadi.service.Opinion.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Opinion;
import ir.mohammadi.repository.Opinion.OpinionRepo;
import ir.mohammadi.service.Opinion.OpinionServ;
import jakarta.persistence.EntityManager;

public class OpinionServImpl extends BaseServiceImpl<Opinion, OpinionRepo> implements OpinionServ {
    public OpinionServImpl(OpinionRepo repository) {
        super(repository);
    }


}

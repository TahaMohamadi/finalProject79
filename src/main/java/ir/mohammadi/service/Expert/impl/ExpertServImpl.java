package ir.mohammadi.service.Expert.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Expert;
import ir.mohammadi.repository.Expert.ExpertRepo;
import ir.mohammadi.service.Expert.ExpertServ;

public class ExpertServImpl extends BaseServiceImpl<Expert, ExpertRepo> implements ExpertServ {
    public ExpertServImpl(ExpertRepo repository) {
        super(repository);
    }
}

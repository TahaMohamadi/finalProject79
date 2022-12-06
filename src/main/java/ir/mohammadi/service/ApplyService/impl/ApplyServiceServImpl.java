package ir.mohammadi.service.ApplyService.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.ApplyService;
import ir.mohammadi.repository.ApplyService.ApplyServiceRepo;
import ir.mohammadi.service.ApplyService.ApplyServiceServ;

public class ApplyServiceServImpl extends BaseServiceImpl<ApplyService, ApplyServiceRepo> implements ApplyServiceServ {

    public ApplyServiceServImpl(ApplyServiceRepo repository) {
        super(repository);
    }
}

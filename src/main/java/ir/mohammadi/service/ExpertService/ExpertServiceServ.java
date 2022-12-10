package ir.mohammadi.service.ExpertService;

import ir.mohammadi.base.service.BaseService;
import ir.mohammadi.entity.Expert;
import ir.mohammadi.entity.ExpertService;
import ir.mohammadi.entity.Service;

import java.util.List;

public interface ExpertServiceServ extends BaseService<ExpertService> {
//    id ya only Id ya Front
    List<ExpertService> FindByExpert(Expert expert);
    List<ExpertService> FindByService(Service service);
    ExpertService changeStatus(Expert expert, Service service, Boolean isAvailable);
    ExpertService FindByExpertAndService(Expert expert, Service service);
}

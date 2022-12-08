package ir.mohammadi.repository.ExpertService;

import ir.mohammadi.base.repository.BaseRepository;
import ir.mohammadi.entity.Expert;
import ir.mohammadi.entity.ExpertService;
import ir.mohammadi.entity.Service;

import java.util.List;

public interface ExpertServiceRepo extends BaseRepository<ExpertService> {
    List<ExpertService> FindByExpert(Expert expert);

    List<ExpertService> FindByService(Service service);

    ExpertService changeStatus(Expert expert, Service service, Boolean isAvailable);

    ExpertService FindByExpertAndService(Expert expert, Service service);
}

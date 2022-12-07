package ir.mohammadi.service.Expert;

import ir.mohammadi.base.service.BaseService;
import ir.mohammadi.entity.Expert;

public interface ExpertServ extends BaseService<Expert> {
    Expert ChangeStatus(Expert expert, Boolean isAvailable);
}

package ir.mohammadi.service.Service;

import ir.mohammadi.base.service.BaseService;
import ir.mohammadi.entity.Service;

public interface ServiceServ extends BaseService<Service> {
    Service AddMainService(String name);
    Service AddSubService(String name, String description, Long basePrice, Service parent);
    Service EditSubService(String description, Long basePrice, Service service);
    Service EditSubService(Long basePrice, Service service);
    Service EditSubService(String description, Service service);
    Boolean CheckService(String name);
}

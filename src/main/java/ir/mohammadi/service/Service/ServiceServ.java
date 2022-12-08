package ir.mohammadi.service.Service;

import ir.mohammadi.base.service.BaseService;
import ir.mohammadi.entity.Service;

import java.util.List;

public interface ServiceServ extends BaseService<Service> {
    Service EditSubService(String description, Long basePrice, Service service);
    Service EditSubPriceService(Long basePrice, Service service);
    Service EditSubDescService(String description, Service service);
    Boolean CheckService(String name);
    List<Service> getMainServices();
    List<Service> getSubServices(Service service);

    Boolean nameCheck(String name);
}

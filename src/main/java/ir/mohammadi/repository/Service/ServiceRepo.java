package ir.mohammadi.repository.Service;

import ir.mohammadi.base.repository.BaseRepository;
import ir.mohammadi.entity.Service;

import java.util.List;

public interface ServiceRepo extends BaseRepository<Service> {


    Service EditSubService(String description, Long basePrice, Service service);

    Service EditSubPriceService(Long basePrice, Service service);

    Boolean CheckService(String name);

    List<Service> getSubServices(Service service);

    Service EditSubDescService(String description, Service service);

    List<Service> getMainServices();
}

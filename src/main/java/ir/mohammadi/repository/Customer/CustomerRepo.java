package ir.mohammadi.repository.Customer;

import ir.mohammadi.base.repository.BaseRepository;
import ir.mohammadi.entity.Customer;
import ir.mohammadi.entity.Service;

import java.util.List;

public interface CustomerRepo extends BaseRepository<Customer> {
    List<Service> LoadMainServices();
    List<Service> LoadSubServices(Service service);
}

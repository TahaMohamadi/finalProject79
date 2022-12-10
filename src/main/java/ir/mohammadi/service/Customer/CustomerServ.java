package ir.mohammadi.service.Customer;

import ir.mohammadi.base.service.BaseService;
import ir.mohammadi.entity.Customer;
import ir.mohammadi.entity.Service;
import ir.mohammadi.entity.enums.Time;

import java.time.LocalDateTime;

public interface CustomerServ extends BaseService<Customer> {
//    create in order
    void CreateOrder(Customer customer, Service service, Long sugPrice, Time timeModel, String description, Integer estimateTime, LocalDateTime dateTime, String address);

}

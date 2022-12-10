package ir.mohammadi.service.Customer.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Customer;
import ir.mohammadi.entity.Order;
import ir.mohammadi.entity.Service;
import ir.mohammadi.entity.enums.OrderStatus;
import ir.mohammadi.entity.enums.Time;
import ir.mohammadi.exceptions.CantCreateOrder;
import ir.mohammadi.repository.Customer.CustomerRepo;
import ir.mohammadi.repository.Order.impl.OrderRepoImpl;
import ir.mohammadi.repository.Service.impl.ServiceRepoImpl;
import ir.mohammadi.service.Customer.CustomerServ;
import ir.mohammadi.service.Order.OrderServ;
import ir.mohammadi.service.Order.impl.OrderServImpl;
import ir.mohammadi.service.Service.ServiceServ;
import ir.mohammadi.service.Service.impl.ServiceServImpl;
import ir.mohammadi.util.Hibernate;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class CustomerServImpl extends BaseServiceImpl<Customer, CustomerRepo> implements CustomerServ {
    public CustomerServImpl(CustomerRepo repository) {
        super(repository);
    }
    ServiceServ serviceServ = new ServiceServImpl(new ServiceRepoImpl(Hibernate.getEntityManagerFactory().createEntityManager()));
    OrderServ orderServ = new OrderServImpl(new OrderRepoImpl(Hibernate.getEntityManagerFactory().createEntityManager()));
    @Override
    public void CreateOrder(Customer customer, Service service, Long sugPrice, Time timeModel, String description, Integer estimateTime, LocalDateTime dateTime, String address) {
        try {
            Order order = new Order();
            order.setCustomer(customer);
            order.setOrderStatus(OrderStatus.WAITINGFORSUG);
            order.setDescription(description);
            order.setDateTime(dateTime);
            order.setSugPrice(sugPrice);
            order.setEstimateTime(estimateTime);
            order.setService(service);
            order.setAddress(address);
            order.setTimeModel(timeModel);
            orderServ.save(order);
        } catch (Exception e){
            throw new CantCreateOrder("cant creat order");
        }
    }
//    load main and sub
//    create order + desc + set status waitingExpertOffer
//
}



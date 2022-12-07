package ir.mohammadi.service.Order.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Order;
import ir.mohammadi.entity.enums.OrderStatus;
import ir.mohammadi.repository.Order.OrderRepo;
import ir.mohammadi.service.Order.OrderServ;

public class OrderServImpl extends BaseServiceImpl<Order, OrderRepo> implements OrderServ {
    public OrderServImpl(OrderRepo repository) {
        super(repository);
    }

    @Override
    public Order ChangeStatusOrder(OrderStatus orderStatus, Order order) {
        try{
            return repository.ChangeStatusOrder(orderStatus, order);
        } catch (Exception e) {
            throw null;
        }
    }
}

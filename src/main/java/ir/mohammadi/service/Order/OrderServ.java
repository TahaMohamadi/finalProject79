package ir.mohammadi.service.Order;

import ir.mohammadi.base.service.BaseService;
import ir.mohammadi.entity.Order;
import ir.mohammadi.entity.enums.OrderStatus;

public interface OrderServ extends BaseService<Order> {
    Order ChangeStatusOrder(OrderStatus orderStatus, Order order);

}

package ir.mohammadi.repository.Order;

import ir.mohammadi.base.repository.BaseRepository;
import ir.mohammadi.entity.Order;
import ir.mohammadi.entity.enums.OrderStatus;

public interface OrderRepo extends BaseRepository<Order> {
    Order ChangeStatusOrder(OrderStatus orderStatus, Order order);
}

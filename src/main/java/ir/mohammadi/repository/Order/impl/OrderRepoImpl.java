package ir.mohammadi.repository.Order.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Order;
import ir.mohammadi.repository.Order.OrderRepo;
import jakarta.persistence.EntityManager;

public class OrderRepoImpl extends BaseRepositoryImpl<Order> implements OrderRepo {
    public OrderRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Order> getEntityClass() {
        return Order.class;
    }
}

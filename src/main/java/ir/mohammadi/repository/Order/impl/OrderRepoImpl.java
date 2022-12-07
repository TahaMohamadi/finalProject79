package ir.mohammadi.repository.Order.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.ExpertService;
import ir.mohammadi.entity.Order;
import ir.mohammadi.entity.enums.OrderStatus;
import ir.mohammadi.repository.Order.OrderRepo;
import ir.mohammadi.util.Hibernate;
import jakarta.persistence.EntityManager;

public class OrderRepoImpl extends BaseRepositoryImpl<Order> implements OrderRepo {
    public OrderRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Order> getEntityClass() {
        return Order.class;
    }

    @Override
    public Order ChangeStatusOrder(OrderStatus orderStatus, Order order) {
        String jpql = """
                UPDATE Order o
                SET o.orderStatus = :orderStatus
                WHERE o.id = :OrderId 
                """;
        return (Hibernate.getEntityManagerFactory().createEntityManager().createQuery(jpql, Order.class).setParameter("orderStatus", orderStatus).setParameter("order", order.getId())).getSingleResult();
    }
}

package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import ir.mohammadi.entity.enums.OrderStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Order extends BaseEntity {
    @OneToOne
    private Customer customer;
    @OneToOne
    private Service service;
    private Long sugPrice;
    private String description;
    private Integer estimateTime;
    private LocalDateTime dateTime;
    @Enumerated
    private OrderStatus orderStatus;
}

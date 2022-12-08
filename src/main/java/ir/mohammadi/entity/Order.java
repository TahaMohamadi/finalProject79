package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import ir.mohammadi.entity.enums.OrderStatus;
import ir.mohammadi.entity.enums.Time;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
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
    @Enumerated(value = EnumType.STRING)
    private Time timeModel;
    private Integer estimateTime;
    private LocalDateTime dateTime;
    @Enumerated(value = EnumType.STRING)
    private OrderStatus orderStatus;
    private String address;
}

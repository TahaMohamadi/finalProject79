package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ApplyService extends BaseEntity {
    @OneToOne
    private Expert expert;
    @OneToOne
    private Customer customer;
    @OneToOne
    private Service service;
    private Long price;
    private LocalDateTime fromDateTime;
    private LocalDateTime thruDateTime;
    @OneToOne
    private Opinion opinion;
    @OneToOne
    private Suggestion suggestion;
}

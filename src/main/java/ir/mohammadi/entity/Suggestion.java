package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Suggestion extends BaseEntity {
    @OneToOne
    private Expert expert;
    private LocalDate fromDate;
    private LocalDate thruDate;
    private Long price;
    private Integer estimateTime;

}

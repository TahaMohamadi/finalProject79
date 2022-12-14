package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Opinion extends BaseEntity {
    private Integer score;
    private String description;
    @OneToOne
    @JoinColumn(unique = true)
    private ApplyService applyService;
    @OneToOne
    private Customer customer;
}

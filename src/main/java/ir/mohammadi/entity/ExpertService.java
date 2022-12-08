package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ExpertService extends BaseEntity {
    @OneToOne
    private Expert expert;
    @OneToOne
    private Service service;
    private Boolean isAvailable;
}

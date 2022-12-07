package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Service extends BaseEntity {
    private String name;
    @OneToOne
    private Service parent;
    private String description;
    private Long basePrice;
}

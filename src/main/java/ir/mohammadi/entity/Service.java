package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Service extends BaseEntity {
    @Column(unique = true)
    private String name;
    @OneToOne
    private Service parent;
    private String description;
    private Long basePrice;
}

package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private Long nationalCode;
    private LocalDate birthDate;
}

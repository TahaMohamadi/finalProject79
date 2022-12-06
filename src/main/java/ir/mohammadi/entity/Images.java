package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import lombok.*;
import org.hibernate.annotations.Type;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Images extends BaseEntity {
    @Lob
    private byte[] name;

}

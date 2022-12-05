package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import ir.mohammadi.entity.enums.UserType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class UserAccount extends BaseEntity {
    private String username;
    private String password;
    @Enumerated
    private UserType userType;
    private String email;
    private Long phoneNumber;
    @OneToOne
    private Person person;
}

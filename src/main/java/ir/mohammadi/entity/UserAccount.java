package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import ir.mohammadi.entity.enums.UserType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class UserAccount extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false , length = 8)
    private String password;
    @Enumerated(value = EnumType.STRING)
    private UserType userType;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private Long phoneNumber;
    @OneToOne
    private Person person;
}

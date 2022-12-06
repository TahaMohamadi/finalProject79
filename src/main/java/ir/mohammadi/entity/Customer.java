package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer extends BaseEntity {
    @OneToOne
    private Person person;
    @OneToOne
    private CreditWallet creditWallet;
    @OneToOne
    private UserAccount userAccount;
}

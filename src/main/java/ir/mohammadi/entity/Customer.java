package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
    @OneToOne(optional = false)
    @JoinColumn(nullable = false, unique = true)
    private Person person;
    @OneToOne
    @JoinColumn(unique = true)
    private CreditWallet creditWallet;
    @OneToOne(optional = false)
    @JoinColumn(nullable = false, unique = true)
    private UserAccount userAccount;
}

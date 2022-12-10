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
public class CreditWallet extends BaseEntity {
    private Long value;
    @OneToOne(optional = false)
    @JoinColumn(nullable = false, unique = true)
    private UserAccount userAccount;
}

package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import ir.mohammadi.entity.enums.ExpertStatus;
import ir.mohammadi.entity.enums.Expertise;
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
public class Expert extends BaseEntity {
    @OneToOne
    private CreditWallet creditWallet;
    @OneToOne
    private Person person;
    @OneToOne
    private UserAccount userAccount;
    @Enumerated
    private Expertise expertise;
    @Enumerated
    private ExpertStatus expertStatus;
    @OneToOne
    private Images image;
}

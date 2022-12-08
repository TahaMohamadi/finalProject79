package ir.mohammadi.entity;

import ir.mohammadi.base.entity.BaseEntity;
import ir.mohammadi.entity.enums.ExpertStatus;
import ir.mohammadi.entity.enums.Expertise;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    @OneToOne(optional = false)
    @JoinColumn(nullable = false, unique = true)
    private UserAccount userAccount;
    @Enumerated(value = EnumType.STRING)
    private Expertise expertise;
    @Enumerated(value = EnumType.STRING)
    private ExpertStatus expertStatus;
    @OneToOne
    private Images image;
    @ColumnDefault(value = "0.0")
    private Double totalScore;
}

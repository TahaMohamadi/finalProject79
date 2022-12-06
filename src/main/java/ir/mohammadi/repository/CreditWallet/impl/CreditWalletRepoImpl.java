package ir.mohammadi.repository.CreditWallet.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.CreditWallet;
import ir.mohammadi.repository.CreditWallet.CreditWalletRepo;
import jakarta.persistence.EntityManager;

public class CreditWalletRepoImpl extends BaseRepositoryImpl<CreditWallet> implements CreditWalletRepo {

    public CreditWalletRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<CreditWallet> getEntityClass() {
        return CreditWallet.class;
    }
}

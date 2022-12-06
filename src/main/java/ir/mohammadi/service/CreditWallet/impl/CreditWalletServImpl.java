package ir.mohammadi.service.CreditWallet.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.CreditWallet;
import ir.mohammadi.repository.CreditWallet.CreditWalletRepo;
import ir.mohammadi.service.CreditWallet.CreditWalletServ;

public class CreditWalletServImpl extends BaseServiceImpl<CreditWallet, CreditWalletRepo> implements CreditWalletServ {
    public CreditWalletServImpl(CreditWalletRepo repository) {
        super(repository);
    }
}

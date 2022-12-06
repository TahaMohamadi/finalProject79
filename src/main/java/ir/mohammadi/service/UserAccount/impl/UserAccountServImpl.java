package ir.mohammadi.service.UserAccount.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.UserAccount;
import ir.mohammadi.repository.UserAccount.UserAccountRepo;
import ir.mohammadi.service.UserAccount.UserAccountServ;

public class UserAccountServImpl extends BaseServiceImpl<UserAccount, UserAccountRepo> implements UserAccountServ {
    public UserAccountServImpl(UserAccountRepo repository) {
        super(repository);
    }
}

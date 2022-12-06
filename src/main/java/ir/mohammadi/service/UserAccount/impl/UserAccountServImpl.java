package ir.mohammadi.service.UserAccount.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.UserAccount;
import ir.mohammadi.repository.UserAccount.UserAccountRepo;
import ir.mohammadi.service.UserAccount.UserAccountServ;

public class UserAccountServImpl extends BaseServiceImpl<UserAccount, UserAccountRepo> implements UserAccountServ {
    public UserAccountServImpl(UserAccountRepo repository) {
        super(repository);
    }

    @Override
    public UserAccount ChangePassword(String username, String password) {
        try{
            return repository.ChangePassword(username,password);
        } catch (Exception e) {
            throw null;
        }
    }

    @Override
    public Boolean CheckUsername(String username) {
        return null;
    }

    @Override
    public Boolean PasswordValidation(String password) {
        return null;
    }

    @Override
    public Boolean EmailValidation(String email) {
        return null;
    }
}

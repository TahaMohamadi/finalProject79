package ir.mohammadi.service.UserAccount.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.UserAccount;
import ir.mohammadi.exceptions.NotFoundUserException;
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
            throw new NotFoundUserException("cant find any user with this data");
        }
    }

    @Override
    public Boolean CheckUsername(String username) {
        try{
            return repository.CheckUsername(username);
        } catch (Exception e) {
            throw null;
        }
    }

    @Override
    public Boolean PasswordValidation(String password) {
        try{
            return null;
        } catch (Exception e) {
            throw null;
        }
    }

    @Override
    public Boolean EmailValidation(String email) {
        try{
            return repository.EmailValidation(email);
        } catch (Exception e) {
            throw null;
        }
    }
}

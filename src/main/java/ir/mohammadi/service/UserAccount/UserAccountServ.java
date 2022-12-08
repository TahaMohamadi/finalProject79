package ir.mohammadi.service.UserAccount;

import ir.mohammadi.base.service.BaseService;
import ir.mohammadi.entity.UserAccount;

public interface UserAccountServ extends BaseService<UserAccount> {

    UserAccount ChangePassword(String username, String password);
    Boolean CheckUsername(String username);
    //handle in front
    Boolean PasswordValidation(String password);
    //handle in front
    Boolean EmailValidation(String email);


}

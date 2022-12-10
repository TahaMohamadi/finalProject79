package ir.mohammadi.repository.UserAccount;

import ir.mohammadi.base.repository.BaseRepository;
import ir.mohammadi.entity.*;

public interface UserAccountRepo extends BaseRepository<UserAccount> {
    UserAccount ChangePassword(String username, String password);
//usernameExist
    Boolean CheckUsername(String username);
//emailExist
    Boolean EmailValidation(String email);
//hirarki class
    void SignUpExpert(Person person, UserAccount userAccount, Expert expert, CreditWallet creditWallet);

    void SignUpCustomer(Person person, UserAccount userAccount, Customer customer, CreditWallet creditWallet);
}

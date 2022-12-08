package ir.mohammadi.repository.UserAccount;

import ir.mohammadi.base.repository.BaseRepository;
import ir.mohammadi.entity.*;

public interface UserAccountRepo extends BaseRepository<UserAccount> {
    UserAccount ChangePassword(String username, String password);

    Boolean CheckUsername(String username);

    Boolean EmailValidation(String email);

    void SignUpExpert(Person person, UserAccount userAccount, Expert expert, CreditWallet creditWallet);

    void SignUpCustomer(Person person, UserAccount userAccount, Customer customer, CreditWallet creditWallet);
}

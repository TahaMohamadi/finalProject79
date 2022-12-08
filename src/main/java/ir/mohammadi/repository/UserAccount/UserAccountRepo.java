package ir.mohammadi.repository.UserAccount;

import ir.mohammadi.base.repository.BaseRepository;
import ir.mohammadi.entity.UserAccount;

public interface UserAccountRepo extends BaseRepository<UserAccount> {
    UserAccount ChangePassword(String username, String password);

    Boolean CheckUsername(String username);

    Boolean EmailValidation(String email);
}

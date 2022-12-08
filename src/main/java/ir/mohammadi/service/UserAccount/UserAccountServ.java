package ir.mohammadi.service.UserAccount;

import ir.mohammadi.base.service.BaseService;
import ir.mohammadi.entity.Person;
import ir.mohammadi.entity.UserAccount;
import ir.mohammadi.entity.enums.Expertise;
import ir.mohammadi.entity.enums.UserType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

public interface UserAccountServ extends BaseService<UserAccount> {

    UserAccount ChangePassword(String username, String password);
    Boolean CheckUsername(String username);
    //handle in front
    Boolean PasswordValidation(String password);
    //handle in front
    Boolean EmailValidation(String email);
    void SignUpExpert(String firstName,String lastName,Long nationalCode,String username,String password,UserType userType,String email,Long phoneNumber,Expertise expertise, LocalDate birthDate);
    void SignUpCustomer(String firstName,String lastName,Long nationalCode,String username,String password,UserType userType,String email,Long phoneNumber, LocalDate birthDate);


}


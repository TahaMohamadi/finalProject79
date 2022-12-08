package ir.mohammadi.service.UserAccount.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.*;
import ir.mohammadi.entity.enums.ExpertStatus;
import ir.mohammadi.entity.enums.Expertise;
import ir.mohammadi.entity.enums.UserType;
import ir.mohammadi.exceptions.NotFoundUserException;
import ir.mohammadi.exceptions.PasswordValidationException;
import ir.mohammadi.exceptions.ValidationEmailException;
import ir.mohammadi.exceptions.ValidationUsernameException;
import ir.mohammadi.repository.UserAccount.UserAccountRepo;
import ir.mohammadi.service.UserAccount.UserAccountServ;
import ir.mohammadi.service.Validation.ValidationImpl;
import ir.mohammadi.service.Validation.ValidationServ;

import java.time.LocalDate;

public class UserAccountServImpl extends BaseServiceImpl<UserAccount, UserAccountRepo> implements UserAccountServ {
    public UserAccountServImpl(UserAccountRepo repository) {
        super(repository);
    }
    ValidationServ validationServ = new ValidationImpl();
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
            return validationServ.validationPassword(password);
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

    @Override
    public void SignUpExpert(String firstName, String lastName, Long nationalCode, String username, String password, UserType userType, String email, Long phoneNumber, Expertise expertise, LocalDate birthDate) {
        try{
            Person person = new Person();
                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setNationalCode(nationalCode);
                person.setBirthDate(birthDate);
                person.setFirstName(firstName);

            UserAccount userAccount = new UserAccount();
            userAccount.setUserType(UserType.EXPERT);
            if (validationServ.validationPassword(password)){
                userAccount.setPassword(password);
            }else {
                throw new PasswordValidationException("your password is not valid");
            }
            if(validationServ.validationUsername(username) && repository.CheckUsername(username)){
                userAccount.setUsername(username);
            }else {
                throw new ValidationUsernameException("your username is not valid");
            }
            if (validationServ.checkEmail(email) && repository.EmailValidation(email)){
                userAccount.setEmail(email);
            }else {
                throw new ValidationEmailException("your email is not valid");
            }

            userAccount.setPerson(person);
            userAccount.setPhoneNumber(phoneNumber);
            CreditWallet creditWallet = new CreditWallet();
            creditWallet.setUserAccount(userAccount);
            creditWallet.setValue(0L);
            Expert expert= new Expert();
            expert.setExpertStatus(ExpertStatus.NEW);
            expert.setPerson(person);
            expert.setTotalScore(0.0);
            expert.setUserAccount(userAccount);
            expert.setCreditWallet(creditWallet);
            repository.SignUpExpert( person, userAccount, expert,creditWallet);
        } catch (Exception e) {
            throw null;
        }
    }

    @Override
    public void SignUpCustomer(String firstName, String lastName, Long nationalCode, String username, String password, UserType userType, String email, Long phoneNumber, LocalDate birthDate) {
        try{
            Person person = new Person();
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setNationalCode(nationalCode);
            person.setBirthDate(birthDate);
            person.setFirstName(firstName);

            UserAccount userAccount = new UserAccount();
            userAccount.setUserType(UserType.CUSTOMER);
            if (validationServ.validationPassword(password)){
                userAccount.setPassword(password);
            }else {
                throw new PasswordValidationException("your password is not valid");
            }
            if(validationServ.validationUsername(username) && repository.CheckUsername(username)){
                userAccount.setUsername(username);
            }else {
                throw new ValidationUsernameException("your username is not valid");
            }
            if (validationServ.checkEmail(email) && repository.EmailValidation(email)){
                userAccount.setEmail(email);
            }else {
                throw new ValidationEmailException("your email is not valid");
            }

            userAccount.setPerson(person);
            userAccount.setPhoneNumber(phoneNumber);
            CreditWallet creditWallet = new CreditWallet();
            creditWallet.setUserAccount(userAccount);
            creditWallet.setValue(0L);
            Customer customer= new Customer();
            customer.setPerson(person);
            customer.setUserAccount(userAccount);
            customer.setCreditWallet(creditWallet);
            repository.SignUpCustomer( person, userAccount, customer,creditWallet);
        } catch (Exception e) {
            throw null;
        }

    }
}

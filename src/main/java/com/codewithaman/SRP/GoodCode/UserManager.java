package com.codewithaman.SRP.GoodCode;

public class UserManager {
    UserValidator userValidator = new UserValidator();
    UserRepository userRepository = new UserRepository();
    EmailService emailService = new EmailService();

    public void registerUser(String userName, String email) {
        userValidator.emailValidator(email);
        userRepository.saveUser(userName);
        emailService.sendEmail(email);
    }
}

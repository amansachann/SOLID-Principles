package com.codewithaman.SRP.GoodCode;

public class UserValidator {
    public void emailValidator(String email) {
       if(!email.contains("@") || !email.contains(".com"))
           throw new IllegalArgumentException("Invalid email");
    }
}

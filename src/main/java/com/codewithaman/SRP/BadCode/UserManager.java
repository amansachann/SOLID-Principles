package com.codewithaman.SRP.BadCode;

public class UserManager {
    public void registerUser(String userName, String email) {
//    1. Validate the user data
        if(!email.contains("@") || !email.contains(".com")) throw new IllegalArgumentException("Invalid email");
//    2. Save user data to database
        System.out.println("Saved user " + userName + " to database");
//    3. Send welcome email to user
        System.out.println("Sent welcome email to " + userName);
    }
}

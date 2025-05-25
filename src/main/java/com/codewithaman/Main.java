package com.codewithaman;

import com.codewithaman.SRP.GoodCode.UserManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.registerUser("amansachann", "amansachan@gmail.com");
    }
}
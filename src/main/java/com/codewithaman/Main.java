package com.codewithaman;

//import com.codewithaman.OCP.BadCode.Invoice;
import com.codewithaman.OCP.GoodCode.*;
//import com.codewithaman.SRP.BadCode.UserManager;
import com.codewithaman.SRP.GoodCode.UserManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Single Responsibilty Principle (SRP)
//        UserManager userManager = new UserManager();
//        userManager.registerUser("amansachann", "amansachan@gmail.com");

//        Open Closed Principle (OCP)
        DiscountStrategy discountStrategy = new SilverDiscount();
        Invoice invoice = new Invoice(discountStrategy);
        System.out.println("Dicount provided: " + (int)(invoice.calculateDiscount()*100) + "%");

        //Dependency Inversion Principle (DIP)
    }
}
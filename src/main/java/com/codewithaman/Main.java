package com.codewithaman;

//import com.codewithaman.OCP.BadCode.Invoice;
//import com.codewithaman.LSP.Badcode.Bird;
//import com.codewithaman.LSP.Badcode.Ostrich;
//import com.codewithaman.LSP.Badcode.Sparrow;
import com.codewithaman.LSP.Goodcode.*;
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
//        DiscountStrategy discountStrategy = new SilverDiscount();
//        Invoice invoice = new Invoice(discountStrategy);
//        System.out.println("Dicount provided: " + (int)(invoice.calculateDiscount()*100) + "%");

//        Liskov Substitution Principle
//        Bad Code
//        Bird sparrow = new Sparrow();
//        sparrow.eat();
//        sparrow.fly();
//        Bird ostrich = new Ostrich();
//        ostrich.eat();
//        ostrich.fly();

//        Good Code
        FlyingBird sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();
        Bird ostrich = new Ostrich();
        ostrich.eat();
    }
}
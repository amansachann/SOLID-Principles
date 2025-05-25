package com.codewithaman.LSP.Badcode;

public class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    };
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    };
}

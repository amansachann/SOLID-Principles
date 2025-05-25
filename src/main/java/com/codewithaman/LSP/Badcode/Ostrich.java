package com.codewithaman.LSP.Badcode;

public class Ostrich extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly");
    };
    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    };
}

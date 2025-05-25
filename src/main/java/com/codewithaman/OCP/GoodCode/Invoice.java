package com.codewithaman.OCP.GoodCode;

public class Invoice {
    private DiscountStrategy discountStrategy;

    public Invoice(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount() {
        return discountStrategy.getDiscount();
    }

}

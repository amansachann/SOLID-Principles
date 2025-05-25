package com.codewithaman.OCP.GoodCode;

public class GoldDiscount implements DiscountStrategy{
    @Override
    public double getDiscount() {
        return 0.2;
    }
}

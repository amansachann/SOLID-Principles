package com.codewithaman.OCP.GoodCode;

public class SilverDiscount implements DiscountStrategy{
    @Override
    public double getDiscount() {
        return 0.1;
    }
}

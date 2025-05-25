package com.codewithaman.OCP.GoodCode;

public class PlatinumDiscount implements DiscountStrategy {
    @Override
    public double getDiscount() {
        return 0.3;
    }
}

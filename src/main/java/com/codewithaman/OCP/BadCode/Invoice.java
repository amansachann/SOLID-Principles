package com.codewithaman.OCP.BadCode;

public class Invoice {
    public double calculateDiscount(String membershipType) {
        if(membershipType.equals("GOLD")) {
            return 0.2;
        } else if(membershipType.equals("SILVER")) {
            return 0.1;
        } else {
            return 0.0;
        }
    }
}

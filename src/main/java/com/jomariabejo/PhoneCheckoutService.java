package com.jomariabejo;

public class PhoneCheckoutService extends Phone {
    @Override
    public double calculateTotalSales() {
        /**
         * Total sales = Price * Quantity sold
         */
        return getPrice() * getQuantitySold();
    }
}

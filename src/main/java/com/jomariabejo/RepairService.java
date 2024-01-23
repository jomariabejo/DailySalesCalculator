package com.jomariabejo;

public class RepairService extends Phone {
    private int pricePerHour;
    private int totalHoursWorked;

    @Override
    public double calculateTotalSales() {
        /**
         * Total sales = Price per hour * Number of hours
         */
        return getTotalHoursWorked() * getPricePerHour();
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(int totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }
}

package com.springEdu.techcareer.assignment.cars;

public abstract class MonthlyCar extends Car {

    protected double monthlyRentalFee;

    protected MonthlyCar(int bagCapacity, String color, FuelType fuelType, double dailyRentalFee, int age) {
        super(bagCapacity, color, fuelType, dailyRentalFee, age);
        this.monthlyRentalFee = (dailyRentalFee * 30) - 100;
    }

    public abstract double calculateMonthlyRent(int rentalPeriod);
}

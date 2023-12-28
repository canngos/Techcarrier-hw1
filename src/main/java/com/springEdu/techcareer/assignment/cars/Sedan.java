package com.springEdu.techcareer.assignment.cars;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sedan extends MonthlyCar {

    private boolean isLuxury;

    public Sedan(int bagCapacity, String color, FuelType fuelType, double dailyRentalFee, int age, boolean isLuxury) {
        super(bagCapacity, color, fuelType, dailyRentalFee, age);
        this.isLuxury = isLuxury;
    }

    @Override
    public double calculateDailyRent(int rentalPeriod) {
        if (isLuxury) {
            return (rentalPeriod * dailyRentalFee) + 1000;
        }
        return rentalPeriod * dailyRentalFee;
    }

    @Override
    public double calculateMonthlyRent(int rentalPeriod) {
        return (rentalPeriod * monthlyRentalFee) - (age + 50);
    }
}

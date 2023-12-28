package com.springEdu.techcareer.assignment.cars;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hatchback extends MonthlyCar {
    private boolean isManual;

    public Hatchback(int bagCapacity, String color, FuelType fuelType, double dailyRentalFee, int age, boolean isManual) {
        super(bagCapacity, color, fuelType, dailyRentalFee, age);
        this.isManual = isManual;
    }

    @Override
    public double calculateDailyRent(int rentalPeriod) {
        if (isManual) {
            return (rentalPeriod * dailyRentalFee) - 500;
        }
        return rentalPeriod * dailyRentalFee;
    }

    @Override
    public double calculateMonthlyRent(int rentalPeriod) {
        return (rentalPeriod * monthlyRentalFee) - (rentalPeriod * 50);
    }
}

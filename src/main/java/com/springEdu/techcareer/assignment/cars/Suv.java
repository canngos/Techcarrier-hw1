package com.springEdu.techcareer.assignment.cars;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Suv extends Car{

    private int numberOfSeats;

    public Suv(int bagCapacity, String color, FuelType fuelType, double dailyRentalFee, int age, int numberOfSeats) {
        super(bagCapacity, color, fuelType, dailyRentalFee, age);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateDailyRent(int rentalPeriod) {
        double extraFee = calculateExtraFee();
        return (rentalPeriod * dailyRentalFee) + extraFee;
    }

    private double calculateExtraFee() {
        return 100 / (age + 0.5);
    }
}

package com.springEdu.techcareer.assignment.cars;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public abstract class Car {

    protected int bagCapacity;
    protected String color;
    protected FuelType fuelType;
    protected double dailyRentalFee;
    protected int age;

    public abstract double calculateDailyRent(int rentalPeriod);
}

package com.springEdu.techcareer.assignment;

import com.springEdu.techcareer.assignment.cars.FuelType;
import com.springEdu.techcareer.assignment.cars.Hatchback;
import com.springEdu.techcareer.assignment.cars.Sedan;
import com.springEdu.techcareer.assignment.cars.Suv;

public class TestAssignment {

    public static void main(String[] args) {
        // Create suv, hatchback and sedan cars.
        Suv suvCar = new Suv(200, "red", FuelType.DIESEL, 100, 5, 7);
        Hatchback hatchbackCar = new Hatchback(100, "blue", FuelType.GASOLINE, 80, 3, false);
        Sedan sedanCar = new Sedan(150, "black", FuelType.ELECTRIC, 350, 1, true);

        // Test calculateDailyRent and calculateMonthlyRent methods. (For 10 days and 3 months)
        double suvDailyRent = suvCar.calculateDailyRent(10);
        double hatchbackDailyRent = hatchbackCar.calculateDailyRent(10);
        double sedanDailyRent = sedanCar.calculateDailyRent(10);

        System.out.println("For 10 days, the total rent for the SUV is: " + String.format("%.2f", suvDailyRent) + " TL");
        System.out.println("For 10 days, the total rent for the Hatchback is: " + String.format("%.2f", hatchbackDailyRent) + " TL");
        System.out.println("For 10 days, the total rent for the Sedan is: " + String.format("%.2f", sedanDailyRent) + " TL");

        System.out.println("-------------------------------------------------------------------------");

        double hatchbackMonthlyRent = hatchbackCar.calculateMonthlyRent(3);
        double sedanMonthlyRent = sedanCar.calculateMonthlyRent(3);

        // There is a little discount for the monthly rents.
        System.out.println("For 3 months, the total rent for the Hatchback is: " + String.format("%.2f", hatchbackMonthlyRent) + " TL");
        System.out.println("For 3 months, the total rent for the Sedan is: " + String.format("%.2f", sedanMonthlyRent) + " TL");
        System.out.println("There is no monthly rent for the SUV.");

        System.out.println("-------------------------------------------------------------------------");

        // Test individual and corporate customers.
        Individual individualCustomer = new Individual("Can", "Baturlar", "cbaturlar@gmail.com", "05554443322");
        Corporate corporateCustomer = new Corporate("TechCareer", "Istanbul", "hello@techcareer.net", "0524016374100063");

        // Authorization class has a static method named isAuthorized. This method is for checking if the customer can rent the car.
        System.out.println("Individual customer can rent only Hatchback cars:");
        System.out.println("When individual customer tries to rest hatchback car result is: " + Authorization.isAuthorized(individualCustomer, hatchbackCar));
        System.out.println("When individual customer tries to rest sedan car result is: " + Authorization.isAuthorized(individualCustomer, sedanCar));
        System.out.println("When individual customer tries to rest SUV car result is: " + Authorization.isAuthorized(individualCustomer, suvCar));

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Corporate customer can rent all cars:");
        System.out.println("SUV: " + Authorization.isAuthorized(corporateCustomer, suvCar));
        System.out.println("Hatchback: " + Authorization.isAuthorized(corporateCustomer, hatchbackCar));
        System.out.println("Sedan: " + Authorization.isAuthorized(corporateCustomer, sedanCar));
    }
}

package com.springEdu.techcareer.assignment;

import com.springEdu.techcareer.assignment.cars.Car;
import com.springEdu.techcareer.assignment.cars.Hatchback;

public class Authorization {

    private Authorization() {
    }

    public static boolean isAuthorized(User user, Car car) {
        if (user instanceof Corporate) {
            return true;
        } else {
            return canIndividualRent(car);
        }
    }

    private static boolean canIndividualRent(Car car) {
        return car instanceof Hatchback;  // Individual can rent only hatchback cars. In the future, this method can be improved.
    }
}

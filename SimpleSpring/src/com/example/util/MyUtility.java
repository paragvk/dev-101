package com.example.util;

import com.example.domain.CarItem;

public class MyUtility {

    public static String describeCar(CarItem car) {
        return "Make: " + car.getMake() + " | " + "Model: " + car.getModel() + " | " + " Color: " + car.getColor()
                + " | " + "Year: " + car.getYear();
    }

}

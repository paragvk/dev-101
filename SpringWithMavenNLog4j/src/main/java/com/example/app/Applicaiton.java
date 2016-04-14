package com.example.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.domain.CarItem;
import com.example.util.MyUtility;

public class Applicaiton {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "application-context.xml");

        CarItem car1 = (CarItem) applicationContext.getBean("redCar");
        System.out.println(MyUtility.describeCar(car1));

        CarItem car2 = (CarItem) applicationContext.getBean("coolCar");
        System.out.println(MyUtility.describeCar(car2));

        applicationContext.close();

    }

}

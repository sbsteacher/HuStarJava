package com.koreait.first.obj;

public class CarMain {
    public static void main(String[] args) {
        String str = new String("");
        Car car = new Car();
        car.cc = 2000;
        car.model = "소나타";
        car.drive();

        car.cc = 3000;
        car.drive();
    }
}

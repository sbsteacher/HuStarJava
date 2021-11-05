package com.koreait.first.obj;

public class CarMainDeepCopy {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "테슬라";
        car.cc = 2000;
        Car car2 = deepCopy(car);
        car.drive();
        car2.drive();
        System.out.println(car == car2);
    }

    public static Car deepCopy(Car car) {
        Car temp = new Car();
        temp.model = car.model;
        temp.cc = car.cc;
        return temp;
    }
}

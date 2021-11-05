package com.koreait.first.obj;

public class CarMain2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1 == car2);
        car1.model = "소나타";
        car1.cc = 2000;
        car2.model = "아반떼";
        car2.cc = 1000;
        car1.drive();
        car2.drive();

        car1 = car2; //얕은복사
        car2.model = "그랜저";
        System.out.println(car1 == car2);
        car1.drive();
        car2.drive();
    }
}

package com.koreait.first.poly;

public class AnimalMain {
    /*
        다형성
        1. 부모타입은 자식객체 주소값 저장할 수 있다.
        2. 자식타입은 부모객체 주소값 저장할 수 없다.
        3. 메소드 호출은 타입이 알고 있는 메소드만 호출할 수 있고, 실제로 호출되는 것은 객체기준이다.
    */
    public static void main(String[] args) {
        //Animal ani_1 = new Animal();
        Animal ani_2 = new Cat(); //타입과 객체화되는 클래스 이름이 다르면 100% 상속 관계이다.
        // Animal ani_3 = new String(); // 상속 관계가 아닌 객체 주소값은 저장할 수 없다.
        // Cat cat_1 = new Animal(); //자식 타입으로는 부모 객체 주소값 저장할 수 없다.
        Cat cat_2 = (Cat)ani_2;
        // Cat cat_3 = (Cat)ani_1; //ani_1에는 Animal 객체 주소값이 저장되어 있기 때문에 자식 타입인 Cat으로는 저장할 수 없다.

        System.out.println(" animal exit ");
    }
}

package com.koreait.first.poly;

public class AnimalMain3 {
    public static void main(String[] args) {
        Animal ani_1 = new Shepherd();

        // ani_1.actCharming();
        // Animal타입은 actCharming 메소드를 모른다.

        Shepherd shepherd = (Shepherd) ani_1;
        shepherd.actCharming();

        Dog dog_1 = (Dog)ani_1;
        dog_1.eat();

    }
}

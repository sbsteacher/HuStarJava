package com.koreait.first.poly;

public class AnimalMain4 {
    public static void main(String[] args) {
        Animal ani_1 = new Cat();

        System.out.println(ani_1 instanceof Dog);
        System.out.println(ani_1 instanceof Shepherd);

        if(ani_1 instanceof Dog) {
            Dog dog = (Dog)ani_1;
            dog.eat();
        }
        System.out.println("종료!");
    }
}

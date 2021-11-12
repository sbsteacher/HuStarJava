package com.koreait.first.poly;

public class AnimalMission {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Shepherd sheperd = new Shepherd();
        Bird bird = new Bird();

        AnimalMission.animalCrying(cat);
        AnimalMission.animalCrying(dog);
        AnimalMission.animalCrying(sheperd);
        AnimalMission.animalCrying(bird);
    }

    public static void animalCrying(Animal ani) { ani.crying(); }



}

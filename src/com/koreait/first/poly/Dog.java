package com.koreait.first.poly;

public class Dog extends Animal {
    @Override
    public void crying() {
        System.out.println("강아지가 멍~ 멍~");
    }

    public void eat() {
        System.out.println("강아지가 사료를 먹는다.");
    }
}

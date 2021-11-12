package com.koreait.first.poly;

public class Shepherd extends Dog {
    @Override
    public void crying() {
        System.out.println("셰퍼드가 월~ 월~");
    }

    @Override
    public void eat() {
        System.out.println("셰퍼드가 고기를 먹는다.");
    }

    public void actCharming() {
        System.out.println("꼬리를 흔들며 애교를 부린다.");
    }
}

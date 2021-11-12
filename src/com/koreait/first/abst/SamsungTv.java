package com.koreait.first.abst;

public class SamsungTv extends Tv {

    public SamsungTv() {
        super(100, 30);
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung Logo 보인다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung Logo 꺼진다.");
    }

}

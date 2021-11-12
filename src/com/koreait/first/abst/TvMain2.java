package com.koreait.first.abst;

public class TvMain2 {
    public static void main(String[] args) {
        Tv tv = new SamsungTv();
        tv.turnOn();
        tv.turnOff();
        tv.channelUp();
        tv.channelDown();
        tv.volumeUp();
        tv.volumeDown();

        System.out.println(tv);
        for(int i=0; i<101; i++) {
            tv.channelUp();
        }
        System.out.println(tv);

        for(int i=0; i<100; i++) {
            tv.volumeUp();
        }
        System.out.println(tv);

        for(int i=0; i<100; i++) {
            tv.volumeDown();
        }
        System.out.println(tv);
    }
}

package com.koreait.first.ch01;

public class Flow {
    public static void main(String[] args) {
        byte b;
        short s = 129;

        b = (byte)s; //오버 플로우가 발생
        System.out.println("b : " + b);

        short s2 = -129;
        b = (byte)s2; //언더 플로우가 발생
        System.out.println("b : " + b);

        s = b;
    }
}

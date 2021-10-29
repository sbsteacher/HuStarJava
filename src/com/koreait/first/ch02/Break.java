package com.koreait.first.ch02;

public class Break {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            if(i == 2) {
                break; //반복문 박살낸다.
            }
            System.out.println(i);
        }
    }
}

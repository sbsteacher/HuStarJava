package com.koreait.first.ch02;

public class While {
    /*
        while(조건식) {

        }
        조건식이 true인 동안 계속 반복한다.

        for문은 몇 번 반복하는지 알 때 쓴다.
        while문은 언제 멈춰야될지 알 때 쓴다.
     */
    public static void main(String[] args) {
        int i=0;
        while(i<10) {
            System.out.println(i);
            i++;
        }

        for(int z=0; z<10; z++) {
            System.out.println(z);
        }
    }
}

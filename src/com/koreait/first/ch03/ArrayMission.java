package com.koreait.first.ch03;

public class ArrayMission {
    public static void main(String[] args) {
        int[] intArr = new int[10];

        //값 넣는 담당 for문
        for(int i=0; i<intArr.length; i++) {
            intArr[i] = 100 + i;
        }

        //값 확인 담당 for문
        for(int i=0; i<intArr.length; i++) {
            System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
        }

    }
    /*
    0번 방에 100
    1번 방에 101
    2번 방에 102
    3번 방에 103
    ...
    9번 방에 109 값이 들어가도록 코딩해주세요.
     */
}

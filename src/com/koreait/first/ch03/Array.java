package com.koreait.first.ch03;

public class Array {
    public static void main(String[] args) {
        int[] intArr = new int[150];

        //쓰기
        intArr[0] = 100;
        intArr[3] = 50;
        intArr[99] = 30;

        //읽기
        int n1 = intArr[0];

        for(int i=0; i<intArr.length; i++) {
            System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
        }



    }
    /*
    같은 타입의 여러 값을 편하게 저장하고 사용하기 위해서 쓴다.
     */
}

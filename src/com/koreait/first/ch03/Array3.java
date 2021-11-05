package com.koreait.first.ch03;

public class Array3 {
    public static void main(String[] args) {
        int[][] intArr = new int[3][4];
        int[][] intArr2 = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        System.out.println(intArr[0][0]);
        System.out.println(intArr[0][1]);
        intArr[0][0] = 10;
        System.out.println("---------------A");
        System.out.println(intArr[0][0]);
        System.out.println("--------------B");
        System.out.println(intArr.length);
        System.out.println(intArr2.length);
        System.out.println("--------------C");
        System.out.println(intArr[0].length);
        System.out.println(intArr2[0].length);


    }
}

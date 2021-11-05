package com.koreait.first.ch03;

public class Array2 {

    public static void main(String[] args) {
        //                0    1    2    3
        int[] intArr = { 100, 200, 300, 400, 500 };

        System.out.println("length : " + intArr.length);

        //intArr에 들어있는 모든 값을 더한 결과값을 출력해 주세요.
        int sum = 0;
        for(int i=0; i<intArr.length; i++) {
            //sum = sum + intArr[i];
            sum += intArr[i];
        }
        System.out.println("sum : " + sum);
    }
}

package com.koreait.first.ch03;

public class Method3 {
    public static void main(String[] args) {
        sum(1, 2); //합 : 3
        sum(1, 2, 3); //합 : 6
        sum(1, 2, 3, 4);
        sum(1, 2, 3, 4, 5);
    }

    public static void sum(int...arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            //sum = sum + arr[i];
            sum += arr[i];
        }
        System.out.println("합 : " + sum);
    }
}

package com.koreait.first.ch02;


import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(true) { //무한루프
            System.out.print("숫자를 입력 (종료: 0) ");
            int val = scan.nextInt();
            if(val == 0) {
               break;
            }
            sum = sum + val;
        }
        System.out.println("결과 : " + sum);
    }

    /*
        숫자를 입력 (종료: 0) > 2
        숫자를 입력 (종료: 0) > 10
        숫자를 입력 (종료: 0) > 100
        숫자를 입력 (종료: 0) > 5
        숫자를 입력 (종료: 0) > 0

        결과 : 117
     */
}

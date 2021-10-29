package com.koreait.first.ch02;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        //0~0.99999999999999999
        //0~99
        //1~100
        int rVal = (int)(Math.random() * 100) + 1;
        //System.out.println("rVal : " + rVal);
        System.out.println("------ 업앤다운 Game Start ------");
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("숫자를 입력 : ");
            int val = scan.nextInt();
            if(val > rVal) {
                System.out.println("Down!");
            } else if(val < rVal) {
                System.out.println("Up!");
            } else {
                break;
            }
        }
        System.out.println("정답!!");

    }
}

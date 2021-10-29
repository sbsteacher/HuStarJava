package com.koreait.first.ch02;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 : ");

        int score = scan.nextInt();
        System.out.println("score : " + score);

        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        System.out.println("이상");
    }
}

package com.koreait.first.ch02;

import java.util.Scanner;

public class ForMission {
    public static void main(String[] args) {
        //for문을 이용하여 구구단 찍어주시면 된다.
        Scanner scan = new Scanner(System.in);
        System.out.println("몇 단을 찍을까요? ");
        int dan = scan.nextInt();

        for(int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
        }
    }

    /*
        3 x 1 = 3
        3 x 2 = 6
        3 x 3 = 9
        ...
        3 x 9 = 27
     */
}

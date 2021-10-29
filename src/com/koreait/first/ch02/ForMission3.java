package com.koreait.first.ch02;

import java.util.Scanner;

public class ForMission3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("별 갯수 : ");
        int star = scan.nextInt();

        for(int z=0; z<star; z++) {
            for(int i=0; i<star; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
        star : 3
        ***
        ***
        ***

        star : 4
        ****
        ****
        ****
        ****

     */
}

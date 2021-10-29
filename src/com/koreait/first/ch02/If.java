package com.koreait.first.ch02;

import java.util.Scanner;

public class If {
    /*
        if문, 분기문
        이럴 땐 이렇게, 저럴 땐 저렇게 하고 싶을때 쓰는 것
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 성별은? : ");
        String gender = scan.next();
        System.out.println("gender : " + gender);

        if(gender.equals("woman")) {
            System.out.println("아름답다~");
        } else if(gender.equals("man")) {
            System.out.println("멋있다~");
        } else {
            System.out.println("너 잘못 적었어.");
        }
    }
}

package com.koreait.first.ch01;

public class VariableChar {
    public static void main(String[] args) {
        //캐릭터형은 문자 하나만 저장할 수 있는 타입!
        char c = 'a';
        System.out.println("c : " + c);
        System.out.printf("%d - %c\n", (int)c, c);
        c = 'A';
        System.out.println("c : " + c);
        System.out.printf("%d - %c\n", (int)c, c);


        int i = 98;
        System.out.printf("%d - %c\n", i, (char)i);
        long l = 10;
        float f = l;


    }
    /*
        primative type (원시타입, 일반타입)
        총 8개
        정수형 : byte, short, int, long
        실수형 : float, double
        문자형 : char
        불린형 : boolean

        자동형변환 방향
        byte < short < int < long < float < double (String은 문자열 합치기로 만나면 무조건 이긴다.)
     */
}

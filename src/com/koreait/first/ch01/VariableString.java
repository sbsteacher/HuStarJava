package com.koreait.first.ch01;

public class VariableString {
    public static void main(String[] args) {
        String str = "10"; //자바에서 문자열은 쌍따옴표를 사용한다.
        System.out.println("str : " + str);

        int i = 10;
        System.out.println("i : " + i);

        System.out.println("i + i : " + (i + i));
        System.out.println("str + str : " + (str + str));

        System.out.println("i + i + str : " + (i + i + str));
        System.out.println("str + str + i : " + (str + str + i));
    }
}

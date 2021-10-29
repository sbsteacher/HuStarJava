package com.koreait.first.ch01;

public class VariableString2 {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "1";

        System.out.println(s1 == s2);
        //결론은 문자열 비교는 equals 메소드로 해야 한다. ******* 중요중요!
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
    }
    /*
        변수타입이 대문자로 시작하는 것들은 레퍼런스변수 (참조변수)라고 한다.
        레퍼런스 변수는 객체 주소값은 저장한다.
        레퍼런스 변수끼리의 == 비교는 주소값이 같은지 물어보는 것이다.

     */
}

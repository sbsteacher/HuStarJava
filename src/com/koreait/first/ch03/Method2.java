package com.koreait.first.ch03;

public class Method2 {
    public static void main(String[] args) {
        int result = sum(10, 20);
        System.out.println("result : " + result);
        sum(100, 200);
        sum(100, "");
    }

    public static int sum(int n1, int n2) {
        return n1 + n2 ;
    }

    public static int sum(int n1, String n2) {
        return 0;
    }

    public static int sum(String n1, int n2) {
        return 0;
    }

    //오버로딩
    public static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

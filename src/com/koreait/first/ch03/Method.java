package com.koreait.first.ch03;

public class Method {


    public static void main(String[] args) {
        sum(10, 20);
        sum(100, 300);
        minus(100, 60); //minus : 40
        div(10, 3); //div : 3.3
    }
    public static void sum(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("sum : " + sum);
        return;
    }
    public static void div(int n1, int n2) {
        float div = (float)n1 / n2;
        System.out.printf("div : %.1f", div);
    }
    public static void minus(int n1, int n2) {
        System.out.println("minus : " + (n1 - n2));
    }



}

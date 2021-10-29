package com.koreait.first.ch02;

public class Continue {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            if(i == 2) {
                continue; //스킵한다. (증감식으로 바로 간다.)
            }
            System.out.println(i);
        }
    }
}

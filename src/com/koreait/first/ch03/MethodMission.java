package com.koreait.first.ch03;

public class MethodMission {
    public static void main(String[] args) {
        printStar(5); // *****(개행)
        printStar(3); // ***(개행)
        System.out.println("-----------------");
        printStarSqure(4);
        // ***
        // ***
        // ***
        System.out.println("-----------------");
        printStarTriangle(5);
        //*
        //**
        //***
    }

    public static void printStarTriangle(int star) {
        for(int i=1; i<=star; i++) {
            printStar(i);
        }
    }

    public static void printStarSqure(int star) {
        for(int z=0; z<star; z++) {
            printStar(star);
        }
    }

    public static void printStar(int star) {
        for(int i=0; i<star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}

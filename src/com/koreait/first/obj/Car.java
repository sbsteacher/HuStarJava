package com.koreait.first.obj;

public class Car {
    String model;
    int cc;

    public void drive() {
        System.out.printf("cc가 %d인 %s는(은) 달린다.\n", cc, model);
    }
}

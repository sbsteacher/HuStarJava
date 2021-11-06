package com.koreait.first.obj;

public class DiffObjPri {
    public static void main(String[] args) {
        int val = 10;
        IntBox box = new IntBox();
        box.val = 10;

        changeVal(val);
        changeVal(box);

        System.out.println("val : " + val);
        System.out.println("box.val : " + box.val);
    }
    public static void changeVal(int a) {
        a = 20;
    }
    public static void changeVal(IntBox a) {
        a.val = 20;
    }
}

class IntBox {
    int val;
}
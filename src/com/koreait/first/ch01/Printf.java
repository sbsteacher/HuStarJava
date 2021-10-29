package com.koreait.first.ch01;

public class Printf {
    public static void main(String[] args) {
        String nm = "홍길동";
        int age = 22;
        float height = 178.5f;
        char bloodType = 'B';
        // "홍길동은 나이는 20세이고 키는 178.5cm이고, 혈액형은 A형이다";
        System.out.println(nm + "은 나이는 " + age + "세이고 키는 "
                + height + "cm이고, 혈액형은 " + bloodType + "형이다");
        System.out.printf("%s은 나이는 %d세이고 키는 %.1fcm이고, 혈액형은 %c형이다", nm, age, height, bloodType);
    }
}

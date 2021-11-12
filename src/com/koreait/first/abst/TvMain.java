package com.koreait.first.abst;

public class TvMain {
    public static void main(String[] args) {
        Tv tv1 = new SamsungTv();
        System.out.println(tv1);
        System.out.println(tv1.toString());

        String str = new String("aaaa");
        System.out.println(str);

        String str1 = 10 + "";
        String str2 = String.valueOf(10);


    }
}

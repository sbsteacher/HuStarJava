package com.koreait.first.ch02;

public class ForMission2 {
    public static void main(String[] args) {
        for(int i=2; i<10; i++) {
            for(int z=1; z<10; z++) {
                System.out.printf("%d x %d = %d\n", i, z, (i * z));
            }
        }
    }

     /*
        2 x 1 = 2
        2 x 2 = 4
        ...
        2 x 9 = 18
        3 x 1 = 3
        3 x 2 = 6
        3 x 3 = 9
        ...
        3 x 9 = 27
        4 x 1 = 4
        ....
        9 x 9 = 81
     */
}

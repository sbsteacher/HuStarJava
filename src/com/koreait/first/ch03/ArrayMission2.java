package com.koreait.first.ch03;

public class ArrayMission2 {
    public static void main(String[] args) {
        String[] names = {"영희", "영수", "수찬", "희주"};
        int[] scores = new int[names.length];
        int[][] arr = {
             // 영희,영수,수찬,희주
                {100, 80, 70, 60}, //수학
                {100, 90, 95, 100}, //국어
                {100, 100, 50, 80} //영어
        };
        for(int i=0; i<arr.length; i++) {
            for(int z=0; z<arr[i].length; z++) {
                scores[z] += arr[i][z];
            }
        }

        for(int i=0; i<names.length; i++) {
            int sum = scores[i];
            float avg = (float)sum / arr.length;
            System.out.printf("%s 합계: %d, 평균: %.1f\n", names[i], sum, avg);
        }
        //영희 합계: ?, 평균: ?
        //영수 합계: ?, 평균: ?
        //수찬 합계: ?, 평균: ?
        //희주 합계: ?, 평균: ?
    }
}

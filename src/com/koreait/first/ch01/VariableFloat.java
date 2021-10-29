package com.koreait.first.ch01;

public class VariableFloat {
    public static void main(String[] args) {
        //빨간줄 컴파일 에러
        //실행했는데 에러 터지면 런타임 에러
        //리터럴 > 값 그 자체
        float f = 10.1F;
        double d = 10.1;
        //형변환 > 자동형변환, 강제형변환
        d = f; //자동형변환
        f = (float)d; //강제형변환 시켜준 것 (컴파일 에러는 안 생김) 실행시 언더 플로우, 오버 플로우 생길 가능성 있음.
    }
}

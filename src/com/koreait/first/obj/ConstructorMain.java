package com.koreait.first.obj;

public class ConstructorMain {
    /*
    생성자를 만들지 않으면 컴파일러가 기본생성자를 자동으로 만들어준다.
    즉, 생성자를 1개 이상 만들면 컴파일러가 기본생성자를 만들어주지 않는다.
    객체화시 생성자 하나는 꼭 호출을 해야한다.
     */
    /*
    생성자도 메소드의 한 종류 (구분을 할 수 있어야 한다. > 생성자 생성을 할 수 있어야 한다.)
    생성자는 객체화시 딱 한번 호출되는 메소드 (객체화 이후로는 호출 불가능)
    차이점 2가지
    1. 이름이 클래스명과 같음.
    2. 리턴 타입이 없다.
     */
    public static void main(String[] args) {
        Human2 h2 = new Human2();
        Human2 h2_2 = new Human2("홍길동");
    }
}
/*
    this 사용법
    - this. : 멤버필드 접근, 메소드 호출할 때 사용.
    - this() : 생성자 호출
 */
class Human2 {
    private String name;
    private int age;
    private float height;

    public Human2() {}
    public Human2(String name) {
        this(name, 0, 0);
    }
    public Human2(int age) {
        this(null, age, 0);
    }
    public Human2(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}







package com.koreait.first.obj;

public class Access {
    /*
    접근 지시어 | 접근 지정자 | 접근 제어자

    private : 같은 클래스 안에서만 접근 허용
    default : private + 같은 패지키에서도 접근 허용
    protected : default + 상속 관계에서도 접근 허용
    public : 완전 개방

    완전중요!!!! : 멤버필드는 무조건 private 접근지시어 사용해야 한다.
    (예외, 유일하게 멤버필드인데 public 할 수 있는 것이 있다. > 상수)
    이것을 캡슐화 혹은 은닉화라고 한다.

    은닉화된 멤버필드에 값 넣는 방법, 값 빼는 방법을 숙지
    값 넣는 방법 (2가지) : 메소드(setter), 생성자
    값 빼는 방법 (1가지) : 메소드(getter)
     */
    public static void main(String[] args) {
        IntBox2 ib = new IntBox2();
        // ib.val = 10;
        ib.val2 = 20;
    }
}

class IntBox2 {
    private int val;
    public int val2;
}
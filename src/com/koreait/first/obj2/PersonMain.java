package com.koreait.first.obj2;

public class PersonMain {
    public static void main(String[] args) {
        Student stu1 = new Student("홍길동", "대도", 22);
        //stu1.introduceMyself();
        stu1.callMethodParent();
        stu1.callMethodMe();


    }
}

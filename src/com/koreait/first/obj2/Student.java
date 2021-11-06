package com.koreait.first.obj2;
/*
    오버라이딩 :
    부모가 가지고 있는 메소드의 구현이 마음에 들지 않으면
    새롭게 재정의해서 사용하는 기법

 */
public class Student extends Person {

    public Student(String name, String job, int age) {
        super(name, job, age);
    }

    //오버라이딩
    @Override
    public void introduceMyself() {
        System.out.printf("My name is %s, age is %d, job is %s\n", this.getName(), super.getAge(), this.getJob());
    }

    public void callMethodParent() {
        super.introduceMyself();
    }

    public void callMethodMe() {
        this.introduceMyself();
    }
}

package com.koreait.first.obj;

public class GetterSetterMain {
    public static void main(String[] args) {
        Human h1 = new Human();
        //h1.name = "홍길동";
        h1.setName("홍길동");
    }
}

class Human {
    private String name;
    private int age;
    private float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
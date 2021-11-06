package com.koreait.first.obj2;

public class Person {
    private String name;
    private String job;
    private int age;

    public Person(String name, String job, int age) {
        super();
        this.name = name;
        this.job = job;
        this.age = age;
    }
    public void introduceMyself() {
        System.out.printf("저의 이름은 %s이고, 직업은 %s이며 나이는 %d세입니다.\n", name, job, age);
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }
}

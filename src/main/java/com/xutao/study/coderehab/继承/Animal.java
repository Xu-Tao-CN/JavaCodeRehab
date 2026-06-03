package com.xutao.study.coderehab.继承;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();

    public void speak(){
        System.out.println("动物叫");
    };
}

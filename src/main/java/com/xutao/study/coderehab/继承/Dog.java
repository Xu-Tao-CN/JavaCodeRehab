package com.xutao.study.coderehab.继承;

public class Dog extends  Animal{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("正在吃大骨头.........");
    }

    @Override
    public void speak() {
        System.out.println("汪汪汪.......");
    }
}

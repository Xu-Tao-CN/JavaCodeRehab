package com.xutao.study.coderehab.继承;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog("憨豆",10);
        System.out.println(" 小狗: " + dog.getName() + " 年龄: " + dog.getAge());
        dog.eat();
        dog.speak();
    }
}

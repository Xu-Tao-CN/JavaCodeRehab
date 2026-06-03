package com.xutao.study.coderehab.封装;

public class Student {
    private String name;
    private int age;
    private String password;

//    构造函数
    public Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        setPassword(password);
    }

//    getter and setter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    修改密码
    public void setPassword(String password) {
        if (password.length() < 6 || password.length() > 10){
            System.out.println("密码长度不符合要求");
            return;
        }
        this.password = password;
    }

}

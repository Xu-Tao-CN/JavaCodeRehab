package com.xutao.study.coderehab.接口;


public class User {
    private int id;
    private String username;
    private String password;
    private int age;

    // 构造函数
    public User(int id, String username, String password, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
        setpassword(password);
    }


    // getter 方法
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    private void setpassword(String password) {
        if (password.length() < 6 || password.length() > 10){
            System.out.println("密码长度不符合要求");
            return;
        }
        this.password = password;
    }
}

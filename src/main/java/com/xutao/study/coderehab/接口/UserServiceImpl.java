package com.xutao.study.coderehab.接口;


public class UserServiceImpl
        implements UserService{

    @Override
    public void register(User user) {
        System.out.println("用户注册成功");
    }
}

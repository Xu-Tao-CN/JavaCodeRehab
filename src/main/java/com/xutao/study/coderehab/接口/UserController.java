package com.xutao.study.coderehab.接口;


public class UserController {

    public static void main(String[] args) {
        User user = new User(1, "xutao", "123456", 18);
        //    调用UserService中的方法

        UserService userService = new UserServiceImpl();
        userService.register(user);

    }

}

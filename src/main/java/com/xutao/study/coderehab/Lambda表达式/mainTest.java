package com.xutao.study.coderehab.Lambda表达式;

import java.util.Collections;

public class mainTest {

    public static void main(String[] args) {

        MyInterface myInterface = () -> {
            System.out.println("Hello World!");
        };

        myInterface.sayHello();

        MyInterface2 myInterface2 = (a,b) -> {
            return a+b;
        };

        System.out.println(myInterface2.add(2,3));

    }

}

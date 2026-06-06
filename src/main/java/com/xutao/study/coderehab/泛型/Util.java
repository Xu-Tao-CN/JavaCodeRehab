package com.xutao.study.coderehab.泛型;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static <T> void print(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        print("xt");

        List<cat> cats = new ArrayList<>();
        //<? extends T>   Animal类及其子类都可以  只能读取不能写入即不能add（）：因为List<? extends Animal> 可能是List<Cat> 往里面放 Dog 就混乱了
        List<? extends Animal> animals = cats;

        //<? super T>      cat类及其父类   可以读取 写入add（） 读取只能用Object obj = list.get(0);因为你不知道父类是谁
        List<? extends cat> catAnimals = cats;
    }

}

package com.xutao.study.coderehab.异常;

public class exceptionChain {

    public static void main(String[] args) {
        try {
            int c = 10/0;
        }catch (Exception e){
            throw new RuntimeException("系统异常:",e);
        }


    }
}

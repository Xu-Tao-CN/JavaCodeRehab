package com.xutao.study.coderehab.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    public static void main(String[] args) {

        //new 线程池 固定3线程
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            int j = i+1;
            executorService.execute(() -> System.out.println(Thread.currentThread().getName() + "正在执行第" + j +"条任务"));
        }

    }

}

package com.xutao.study.coderehab.CompletableFutureTest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {

    public static void main(String[] args) {

        //有返回值的异步任务
        CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(
                () -> {
                    System.out.println("任务执行当中.........");
                    return "over";
                }
        );

        //无返回值的异步任务
        CompletableFuture<Void> runAsync = CompletableFuture.runAsync(() -> {
            System.out.println("任务执行当中..........");
        });

        //thenApply: 对上一步结果进行加工，有返回值。
        CompletableFuture<String> thenApply = CompletableFuture.supplyAsync(
                () -> {
                    System.out.println("任务执行当中.........");
                    return "hello";
                }
        ).thenApply(
                (str) -> str.toUpperCase()
        );

        try {
            System.out.println(thenApply.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //thenAccept: 对上一步结果进行加工，无返回值。
        CompletableFuture<Void> thenAccept = CompletableFuture.supplyAsync(
                () -> {
                    System.out.println("任务执行当中.........");
                    return "hello";
                }
        ).thenAccept(
                (str) -> System.out.println(str + " world!")
        );

        //thenRun(): 无返回值，无参数,只是用作任务完成后的回调。
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(
                () -> {
                    System.out.println("任务执行当中.........");
                    return "hello";
                }
        ).thenAccept(
                (str) -> System.out.println(str + " world!")
        ).thenRun(
                () -> System.out.println("任务完成")
        );


        //thenCompose(): 对上一步结果进行消费，有返回值。异步任务串行化，避免嵌套 CompletableFuture。
        CompletableFuture<String> thenCompose = CompletableFuture.supplyAsync(
                () -> {
                    System.out.println("任务执行当中.........");
                    return "hello";
                }
        ).thenCompose(
                (str) -> CompletableFuture.supplyAsync(
                        () -> {
                            System.out.println(str + " World!");
                            return "over";
                        }
                )
        );

        //thenCombine(): 合并两个独立任务的结果,有返回值。
        CompletableFuture<String> supplyAsync1 = CompletableFuture.supplyAsync(
                () -> "hello"
        );
        CompletableFuture<String> supplyAsync2 = CompletableFuture.supplyAsync(
                () -> "world"
        );

        CompletableFuture<String> combine = supplyAsync1.thenCombine(supplyAsync2, (s1, s2) -> s1 + " " + s2);
        try {
            System.out.println(combine.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //exceptionally: 异常处理，有返回值。
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> 10 / 0)
                        .exceptionally(e -> {
                            System.out.println("出错：" + e);
                            return -1;
                        });

        try {
            System.out.println(future.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}

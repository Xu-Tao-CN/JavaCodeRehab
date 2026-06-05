package com.xutao.study.coderehab.Collection;

import java.util.*;

public class SetExe {
    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("***********************Collections/Set/HashSet**********************");
        System.out.println("********************************************************");


        /*
         * 原理: Collections/Set/HashSet底层是哈希表实现, 底层哈希表的扩容机制是: 1.5倍,
         * 扩容条件: 当哈希表的容量达到阈值时, 扩容, 阈值 = 数组容量 * 0.75
         * 适用条件: 频繁查询和遍历
         * 适用情况: 频繁查询和遍历, 频繁排序，如：获取前K个最大值, 获取前K个最小值
         * 特点: 无序
         *      不可重复
         *      底层HashMap
         * */
        Set<String> hashset = new HashSet<>();
        hashset.add("a");
        hashset.add("a");
        hashset.add("a");
        hashset.add("a");
        hashset.add("a");
        hashset.add("a");
        hashset.add("c");
        hashset.add("e");
        hashset.add("b");
        hashset.add("f");
        hashset.add("h");
        hashset.add("d");
        hashset.add("g");
        System.out.println("排序前:");
        for(String s : hashset){
            System.out.println(s);
        }

        //哈希表结构，自身无法排序, 需要将集合转换为数组, 再进行排序,底层完整代码实现是 : new ArrayList<>(set)
        // 排序方式1: 使用 Collections.sort()
        Collections.sort(new ArrayList<>(hashset));
        System.out.println("排序后:");
        for(String s : hashset){
            System.out.println(s);
        }

        /*
         * 基本操作:
         * 添加: add()
         * 删除: remove()
         * 查询: contains()
         * 获取集合大小: size()
         * 判断集合是否为空: isEmpty()
         * 获取集合元素: toArray()
         * 获取集合元素: iterator()
         * */

        /*
         * 获取前K个最大值, 获取前K个最小值
         * */

        /*利用hashset统计文章单词数*/
        HashSet<String> ariticle = new HashSet<>();
        String str = new String("hello world,my name is xutao,I am 23 years old,how about you?");
        str = str.replace("[^a-zA-Z0-9]"," ");
        ariticle.addAll(Arrays.asList(str.split(" ")));


        System.out.println("********************************************************");
        System.out.println("****************Collections/Set/TreeSet*****************");
        System.out.println("********************************************************");
        /*
         * 原理: Collections/Set/TreeSet底层是红黑树实现, 底层红黑树的扩容机制是: 2倍,
         * 扩容条件: 当红黑树的容量达到阈值时, 扩容, 阈值 = 数组容量 * 0.5
         * 适用条件: 频繁查询和遍历
         * 特点: 无序, 无重复, 升序
         * */
        Set<String> treeset = new TreeSet<>();
        treeset.add("a");
        treeset.add("c");
        treeset.add("e");
        treeset.add("b");
        treeset.add("f");
        treeset.add("h");
        treeset.add("d");
        treeset.add("g");
        System.out.println("排序前:");
        for(String s : treeset){
            System.out.println(s);
        }

        // 排序方式1: 使用 Collections.sort()
        Collections.sort(new ArrayList<>(treeset));
        System.out.println("排序后:");
        for(String s : treeset){
            System.out.println(s);
        }
        /*
         * 基本操作:
         * 添加: add()
         * 删除: remove()
         * 查询: contains()
         * 获取集合大小: size()
         * 判断集合是否为空: isEmpty()
         * 获取集合元素: toArray()
         * 获取集合元素: iterator()
         * */
        treeset.remove("c");
        System.out.println("删除c后:");
        for(String s : treeset){
            System.out.println(s);
        }



    }
}

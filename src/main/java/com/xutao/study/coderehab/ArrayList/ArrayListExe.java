package com.xutao.study.coderehab.ArrayList;

import java.util.*;

public class ArrayListExe {
    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("************Collections/List/ArrayList****************");
        System.out.println("********************************************************");
        /*
        * 原理: Collections/List/ArrayList底层是数组实现, 底层数组的扩容机制是: 1.5倍,
        * 扩容条件: 当数组的容量达到阈值时, 扩容, 阈值 = 数组容量 * 0.75
        * 适用条件: 频繁查询和遍历
        * */
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("e");
        list.add("b");
        list.add("f");
        list.add("h");
        list.add("d");
        list.add("g");

//        for(String s : list){
//            System.out.println(s);
//        }

//        System.out.println(list.get(0));
        
        // 排序方式1: 使用 Collections.sort()
//        Collections.sort(list);
        
        // 排序方式2: 使用 list.sort() + Lambda
         list.sort((o1, o2) -> o2.compareTo(o1));
        
        // 打印排序后的结果
        System.out.println("排序后:");
        for(String s : list){
            System.out.println(s);
        }


        System.out.println("********************************************************");
        System.out.println("************Collections/List/LinkedList****************");
        System.out.println("********************************************************");

        /*
        * Collections/List/LinkedList底层是链表实现, 底层链表的扩容机制是: 2倍,
        * 扩容条件: 当链表的容量达到阈值时, 扩容, 阈值 = 数组容量 * 0.5
        * 适用情况: 频繁插入和删除, 频繁查询和遍历
        * 适用条件: 频繁插入和删除*/
        List<String> list2 = new LinkedList<>();
        list2.add("a");
        list2.add("c");
        list2.add("e");
        list2.add("b");
        list2.add("f");
        list2.add("h");
        list2.add("d");
        list2.add("g");
        System.out.println("排序前:");
        for(String s : list2){
            System.out.println(s);
        }
        System.out.println("get3:"+list2.get(3));
        // 排序方式1: 使用 Collections.sort()
        Collections.sort(list2);

        // 排序方式2: 使用 list.sort() + Lambda
//        list2.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println("排序后:");
        for(String s : list2){
            System.out.println(s);
        }

        System.out.println("get3:"+list2.get(3));

        System.out.println("********************************************************");
        System.out.println("***********************Collections/Set/HashSet**********************");
        System.out.println("********************************************************");


        /*
         * 原理: Collections/Set/HashSet底层是哈希表实现, 底层哈希表的扩容机制是: 1.5倍,
         * 扩容条件: 当哈希表的容量达到阈值时, 扩容, 阈值 = 数组容量 * 0.75
         * 适用条件: 频繁查询和遍历
         * 适用情况: 频繁查询和遍历, 频繁排序，如：获取前K个最大值, 获取前K个最小值
         * 特点: 无序, 无重复
         * */
        Set<String> hashset = new HashSet<>();
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

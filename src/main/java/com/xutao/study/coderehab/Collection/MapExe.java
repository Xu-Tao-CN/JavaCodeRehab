package com.xutao.study.coderehab.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExe {
    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("****************Collections/map/HashMap*****************");
        System.out.println("********************************************************");

        /*
         * 原理: Collections/map/HashMap
         * 特点: 无序, 可重复, 键值对
         * HashMap 是基于哈希表的键值对集合，
         *  底层 = 数组 + 链表 + 红黑树，
         * 通过哈希算位置，冲突挂链表，太长变红黑树，
         *达到负载因子自动扩容，线程不安全，存取 O (1)。
         * */

        HashMap<Integer, String> stringHashMap = new HashMap<Integer, String>();
        stringHashMap.put(1, "xutao");
        stringHashMap.put(2, "xiaoming");
        stringHashMap.put(3, "xiaohong");
        stringHashMap.put(4, "xiaoli");
        stringHashMap.put(5, "xiaoliu");

        System.out.println("排序前:");
        for (Map.Entry<Integer, String> entry : stringHashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

//        增
        stringHashMap.put(6, "xiaowang");
//        删
        stringHashMap.remove(4);
        System.out.println("删后:");
        for (Map.Entry<Integer, String> entry : stringHashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
//        改查
        stringHashMap.replace(1,"xutaoDashuaibi");

        System.out.println("改后:");
        System.out.println(stringHashMap.get(1));


    }
}

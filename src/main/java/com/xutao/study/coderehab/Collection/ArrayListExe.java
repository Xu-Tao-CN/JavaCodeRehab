package com.xutao.study.coderehab.Collection;

import com.xutao.study.coderehab.接口.User;

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

        User u1 = new User(1, "xutao", "123456",18);
        User u2 = new User(2, "xiaoming", "254565",19);
        User u3 = new User(3, "xiaohong", "123456",20);
        User u4 = new User(4, "xiaoli", "123456",21);
        User u5 = new User(5, "xiaoliu", "123456",22);
        ArrayList<User> UserList = new ArrayList<>();
        UserList.add(u1);
        UserList.add(u2);
        UserList.add(u3);
        UserList.add(u4);
        UserList.add(u5);
        System.out.println("排序前:");
        for (User user : UserList){
            System.out.println(user.getUsername()+", "+user.getAge()+","+user.getId());
        }

        Collections.sort(UserList, new Comparator<User>(){
            @Override
                    public int compare(User o1, User o2) {
                        return o1.getAge() - o2.getAge();
                    }
        });

        System.out.println("排序后:");
        for (User user : UserList){
            System.out.println(user.getUsername()+", "+user.getAge()+","+user.getId());
        }

//        查询
        System.out.println("查询:");
        for (User user : UserList){
            if (user.getId() == 3){
                System.out.println(user.getUsername()+", "+user.getAge()+","+user.getId());
            }
        }

//        修改
        System.out.println("修改:");
        for (User user : UserList) {
            if (user.getId() == 1) {
                user.setAge(23);
            }
            System.out.println(user.getUsername()+"更正后年龄为"+user.getAge());
            break;
        }

//        新增
        UserList.add(new User(6, "xiaowang", "123456",23));
        System.out.println(UserList.get(5).getUsername()+" "+UserList.get(5).getAge()+" ");


//        删除
//        写法一:
        UserList.remove(0);
        System.out.println("删除后:");
        for (User user:UserList){
            System.out.println(user.getId()+" "+user.getUsername()+" "+user.getAge());
        }
    }
}

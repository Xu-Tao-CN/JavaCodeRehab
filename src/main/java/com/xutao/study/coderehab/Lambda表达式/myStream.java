package com.xutao.study.coderehab.Lambda表达式;

import com.xutao.study.coderehab.封装.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class myStream {

    public static void main(String[] args) {

        /*//数据全不为null时
        List<User> userList = new ArrayList<>();
        userList.add(new User(21,"xutao","123456"));
        userList.add(new User(2,"xiaoming","234567"));
        userList.add(new User(93,"xiaohong","345678"));
        userList.add(new User(93,"xiaohong","345678"));
        userList.add(new User(41,"xiaoli","456789"));
        userList.add(new User(15,"xiaoliu","567890"));
        userList.add(new User(6,"xiaoliu","678901"));

        //创建Stream
        Stream<User> userStream = userList.stream();

        //filter：过滤
        List<User> userFilterList = userList.stream().filter(user -> user.getId() >= 10).collect(Collectors.toList());
        userFilterList.forEach(user -> System.out.println(user.getUsername()+" "+user.getId()+" "));

        //map：映射转换
        //将id＋10
        List<Integer> userMappList = userStream.map(user -> user.getId()+10).collect(Collectors.toList());
        userMappList.forEach(id -> System.out.println(id));

        //sorted:排序
        List<User> userSortedList = userList.stream().sorted((o1, o2) -> o2.getId() - o1.getId()).collect(Collectors.toList());
        userSortedList.forEach(user -> System.out.println(user.getId()+" "+user.getUsername()));*/

        //数据存在null时
        List<User> userList = new ArrayList<>();
        userList.add(new User(21,"xutao","123456"));
        userList.add(new User(2,"xiaoming","234567"));
        userList.add(new User(93,"xiaohong","345678"));
        userList.add(null);
        userList.add(new User(93,"xiaohong","345678"));
        userList.add(new User(41,"xiaoli","456789"));
        userList.add(null);
        userList.add(new User(15,"xiaoliu","567890"));
        userList.add(new User(6,"xiaoliu","678901"));

        //创建Stream
        Stream<User> userStream = userList.stream();

        //filter：过滤
        List<User> userFilterList = userList
                .stream()
                .filter(user -> user != null)
                .filter(user -> user.getId() >= 10)
                .collect(Collectors.toList());
        userFilterList.forEach(user -> System.out.println(user.getUsername()+" "+user.getId()+" "));

        //map：映射转换
        //将id＋10
        List<Integer> userMappList = userStream
                .map(user -> Optional.ofNullable(user).map(user1 -> user1.getId()).orElse(0))
                .map(id -> id+10)
                .collect(Collectors.toList());
        userMappList
                .forEach(id -> System.out.println(id));

        //sorted:排序
        List<User> userSortedList = userList
                .stream()
                .filter(user -> user != null)
                .sorted((o1, o2) -> o2.getId() - o1.getId())
                .collect(Collectors.toList());
        userSortedList
                .forEach(user -> System.out.println(user.getId()+" "+user.getUsername()));


    }

}

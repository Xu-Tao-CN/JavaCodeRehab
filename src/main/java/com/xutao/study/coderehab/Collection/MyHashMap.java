package com.xutao.study.coderehab.Collection;

class Node<K, V> {

    K key;
    V value;
    Node<K, V> next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public class MyHashMap<K, V> {

    // 哈希桶数组
    private Node<K, V>[] table;

    public MyHashMap() {
        table = new Node[16];
    }

    /**
     * 计算数组索引
     */
    private int getIndex(K key) {
        return key.hashCode() & (table.length - 1);
    }

    /**
     * 存入键值对
     */
    public void put(K key, V value) {

        int index = getIndex(key);

        //解决hash冲突
        if (table[index] == null){
            table[index] = new Node<>(key, value);
        }else {

            Node currentNode = table[index];
            while (true){
                if (currentNode.next != null){
                    currentNode = currentNode.next;
                }else {
                    currentNode.next = new Node<>(key, value);
                    break;
                }
            }

        }

    }

    /**
     * 根据key获取value
     */
    public V get(K key) {

        int index = getIndex(key);

        //解决hash冲突
        Node<K, V> node = table[index];

        if (node == null) {
            return null;
        }


        while (node != null){

            if (node.key.equals(key)){
                return node.value;
            }

            node = node.next;
        }

        return null;
    }

    public static void main(String[] args) {

        MyHashMap<String, String> map = new MyHashMap<>();

        map.put("xutao", "123456");
        map.put("xutao", "666666");
        map.put("zhangsan", "888888");

        System.out.println(map.get("xutao"));
        System.out.println(map.get("zhangsan"));
        System.out.println(map.get("lisi"));
    }
}
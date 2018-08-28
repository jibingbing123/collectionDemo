package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map中键不能重复,值可以重复;
 * 如果向Map中加入两个键相同的键值对,后者会覆盖前者;
 * Map的entrySet()方法返回一个Set集合,用来遍历Map;
 * 这个集合存放Map.Entry对象,每个Map.Entry对象都存放一对键值对
 * Created by jibingbing on 2018/1/1.
 */
public class EntrySetDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","Mon");
        map.put("1","Monday");
        map.put("one","monday");

        Set<Map.Entry<String,String>> entrySet =  map.entrySet();
        for(Map.Entry entry : entrySet){
            System.out.println("key: " + entry.getKey() + " = value: " + entry.getValue());
        }
    }
}

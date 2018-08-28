package com.arrayAndCollection.transform;

import java.util.*;

/**
 * Created by jibingbing on 2018/1/7.
 */
public class Transform {
    public static void main(String[] args) {
        //数组转换成集合
        Integer[] a = {2,6,3,9};
        List<Integer> list = Arrays.asList(a);

        //大多数集合又可以传入集合参数的构造方法,把指定集合中的元素复制新集合
        List<Integer> arrayList = new ArrayList<>(list);
        Set<Integer> hashSet = new HashSet<>(list);
        System.out.println(arrayList);
        System.out.println(hashSet);

        //集合转换成数组
        Set<String> set = new HashSet<>();
        set.add("ji");
        set.add("bing");
        set.add("bing");

        Object[] objects = set.toArray();
        for(Object object : objects){
            System.out.println(object);
        }

        String[] strings = set.toArray(new String[0]);
        System.out.println(Arrays.toString(strings));
    }
}

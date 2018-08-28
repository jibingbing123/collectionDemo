package com.collection.publicMethod;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet集合之所以能排序,只因为它调用了对象的CompareTo()方法比较集合中对象的大小;
 * 所以TreeSet中只能加入相同类型的对象,并且这些对象必须实现了Comparable接口
 * Created by jibingbing on 2017/12/26.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(12);
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(23);

        System.out.println(treeSet);
    }
}

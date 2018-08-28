package com.arrayAndCollection.transform;

import java.util.*;

/**
 * 集合的批量操作
 * Created by jibingbing on 2018/1/7.
 */
public class BulkTester {
    static final Integer[] DATA1 = {11,22,33,44,55,66};
    static final Integer[] DATA2 = {11,22,77,88};

    static Set<Integer> getOriginalSet(Integer[] data){
        Set<Integer> set = new HashSet<>(Arrays.asList(data));
        return set;
    }

    static void print(Collection<Integer> collection){
        for(Integer i : collection){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Set<Integer> set1 = getOriginalSet(DATA1);
        Set<Integer> set2 = getOriginalSet(DATA2);
        set1.retainAll(set2);
        System.out.println("打印两个集合的交集");
        print(set1);

        set1 = getOriginalSet(DATA1);
        set2 = getOriginalSet(DATA2);
        set1.removeAll(set2);
        System.out.println("\n 打印删除set2中元素后的set1集合");
        print(set1);

        set1 = getOriginalSet(DATA1);
        set2 = getOriginalSet(DATA2);
        set1.addAll(set2);
        System.out.println("\n 打印加入set2中元素后的set1集合");
        print(set1);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(DATA1));
        List<Integer> list2 = list1.subList(1,4);
        System.out.println("\n 打印获取子列表视图");
        print(list2);
        list2.clear();
        System.out.println("\n 打印删除字列表视图后原List集合");
        print(list1);
    }
}

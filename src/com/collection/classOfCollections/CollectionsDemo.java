package com.collection.classOfCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * 1.Collections是Java集合类库中的辅助类,它提供了一些操纵集合的静态方法;
 * sort就是Collections类中用于排序list集合的方法;
 * 2.List的listIterator()方法继承了Iterator接口,此外还提供了专门操纵列表的方法:
 * add():向列表中插入一条数据;
 * hasPrevious()判断列表中是否还有上一个元素;
 * previous()返回列表的上一个元素.
 * Created by jibingbing on 2017/12/28.
 */
public class CollectionsDemo {
    public static void insert(List<Integer> list,int data){
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()){
            Integer in = it.next();
            if(data <= in.intValue()){
                it.previous();
                it.add(data);//插入数据
                break;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(9);


        Collections.sort(list);
        System.out.println(list);

        insert(list,5);
        System.out.println(list);
    }
}

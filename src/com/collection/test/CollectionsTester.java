package com.collection.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Arrays提供一些操纵数组的静态方法,而Collections类,既有操纵List的静态方法,也有操纵所有Collection类型或者Map类型的集合
 * Created by jibingbing on 2018/1/3.
 */
public class CollectionsTester {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"ji","liu","bingbing","ying"});
        Collections.sort(list);

        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.binarySearch(list,"ji"));

        System.out.println(Arrays.toString(list.toArray()));
        Collections.shuffle(list);
        System.out.println(list);

    }
}

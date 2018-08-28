package com.collection.publicMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jibingbing on 2017/12/25.
 */
public class PublicMethodTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String str1 = new String("liu");
        String str2 = new String("ji");

        list.add(str1);
        list.add(str2);
        System.out.println(list);

        boolean isHasStr1 = list.contains(str1);
        if(isHasStr1 == true){
            System.out.println("list包含str1");
        } else {
            System.out.println("list不包含str2");
        }

        System.out.println("isEmpty: " + list.isEmpty());

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("size: " + list.size());

        System.out.println(list.toArray());

        list.remove(str1);
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}

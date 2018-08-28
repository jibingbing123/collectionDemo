package com.collection.test;

import java.util.Arrays;
import java.util.List;

/**
 * Arrays.asList()方法能够把一个数组包装成List对象,这个List对象代表长度固定的数组;
 * 所有对List对象的操作都会作用在底层的数组;
 * 由于数组的长度不可改变,所有此时的List的add()和remove()方法不能使用
 * Created by jibingbing on 2017/12/28.
 */
public class AsListTest {
    public static void main(String[] args) {
        String[] ss = {"ji","liu","bing","ying"};
        List<String> list = Arrays.asList(ss);
        list.set(2,"bingbing");
        System.out.println(list);
        for(String s : ss){
            System.out.println(s);
        }

//        list.add("error");//抛出运行时异常java.lang.UnsupportedOperationException
//        list.remove("ji");
    }
}

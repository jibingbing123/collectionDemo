package com.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 * Deque-双向队列,LinkedList和ArrayDeque都实现了Deque接口
 * Created by jibingbing on 2018/1/1.
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();

        queue.add("ji");
        queue.addFirst("bingbing");
        queue.addLast("liu");
        queue.add("ying");

        System.out.println("遍历双向队列: ");
        for(String s : queue){
            System.out.println(s + " ");
        }

        String s = queue.removeLast();
        System.out.println("删除双向队列的最后一个元素: " + s);
    }
}

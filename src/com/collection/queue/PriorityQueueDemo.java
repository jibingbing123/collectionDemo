package com.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 优先级队列对队列中的元素有排序的检索的功能,所有加入到PriorityQueue中的对象必须实现Comparable接口,
 * 提供排序时对两个元素的比较规则;
 * PriorityQueue中的remove()方法总是先删除列队中最小的元素
 * Created by jibingbing on 2018/1/1.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(67);
        queue.add(23);
        queue.add(95);

        System.out.println("遍历优先级队列: ");
        for(Integer i : queue){
            System.out.println(i);
        }

        System.out.println("依次删除优先级队列中的元素: ");
        while(!queue.isEmpty()){
            System.out.println(queue.remove() + " ");
        }
    }
}

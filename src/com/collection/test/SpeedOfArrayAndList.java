package com.collection.test;

import java.util.*;

/**
 * 比较数组和各种List的性能
 * Created by jibingbing on 2017/12/28.
 */
public class SpeedOfArrayAndList {
    private static final int TIMES = 100000;

    public static abstract class Tester {
        private String operation;
        public Tester(String operation){
            this.operation = operation;
        }
        public abstract void test(List<String> list);

        public String getOperation() {
            return operation;
        }
    }
    /*执行遍历操作的匿名类*/
    static Tester iterateTester = new Tester("iterate") {
        @Override
        public void test(List<String> list) {
            for(int i = 0;i < 10;i++){
                Iterator<String> it = list.iterator();
                while (it.hasNext()){
                    it.next();
                }
            }
        }
    };
    /*执行随机访问操作的匿名内部类*/
    static Tester getTester = new Tester("get") {
        @Override
        public void test(List<String> list) {
            for(int i = 0;i < list.size();i++){
                for(int j = 0;j < 10;j++){
                    list.get(j);
                }
            }
        }
    };
    /*执行插入操作的匿名类*/
    static Tester insertTester = new Tester("insert") {
        @Override
        public void test(List<String> list) {
            ListIterator<String> it = list.listIterator(list.size()/2);
            for(int i = 0;i < TIMES;i++){
                it.add("hello");
            }
        }
    };
    /*执行删除操作的匿名类*/
    static Tester removeTester = new Tester("remove") {
        @Override
        public void test(List<String> list) {
            ListIterator<String> it = list.listIterator();
            while(it.hasNext()){
                it.next();
                it.remove();
            }
        }
    };

    static public void testJavaArray(List<String> list){
        Tester[] testers = {iterateTester,getTester};
        test(testers,list);
    }

    static public void testJavaList(List<String> list){
        Tester[] testers = {iterateTester,getTester,insertTester,removeTester};
        test(testers,list);
    }

    static public void test(Tester[] testers,List<String> list){
        for(int i = 0;i < testers.length;i++){
            System.out.println(testers[i].getOperation() + "操作: ");
            long t1= System.currentTimeMillis();
            testers[i].test(list);
            long t2= System.currentTimeMillis();
            System.out.println(t2 - t1 + " ms");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<String> list = null;

        //测试Java数组
        System.out.println("-----测试Java数组-----");
        String[] ss = new String[TIMES];
        Arrays.fill(ss,"hello");
        list = Arrays.asList(ss);
        testJavaArray(list);

        ss= new String[TIMES/2];
        Collection<String> col = Arrays.asList(ss);

        //测试Vector
        System.out.println("-----测试Vector-----");
        list = new Vector<String>();
        list.addAll(col);
        testJavaList(list);

        //测试LinkedList
        System.out.println("-----测试LinkedList-----");
        list = new LinkedList<>();
        list.addAll(col);
        testJavaList(list);

        //测试ArrayList
        System.out.println("-----测试ArrayList-----");
        list = new ArrayList<>();
        list.addAll(col);
        testJavaList(list);
    }
}



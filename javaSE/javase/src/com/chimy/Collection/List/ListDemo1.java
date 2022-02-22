package com.chimy.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class ListDemo1 {

    public static void main(String[] args) {
        iteratorTest();
    }


    public static void iteratorTest1(){}
    public static void iteratorTest(){

        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");

        //输出集合对象
        System.out.println(list);
        //迭代器的方式遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

    }
}

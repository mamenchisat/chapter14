package com.alibaba.collections_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 项目名：    chapter14
 * 文件名：    CollectionExercise
 * 创建时间：   2022/8/31 10:05
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("大黄", 4));
        list.add(new Dog("小黄", 1));
        list.add(new Dog("小虎", 2));

//        for (Object o : list) {
//            System.out.println(o);
//        }

        //使用迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}

class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
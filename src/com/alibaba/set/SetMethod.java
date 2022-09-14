package com.alibaba.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 项目名：    chapter14
 * 文件名：    SetMethod
 * 创建时间：   2022/8/31 15:43
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("jhon");
        set.add("lucy");
        set.add("jhon");
        set.add("jack");
        set.add(null);
        set.add(null);
        System.out.println(set);
        for (Object o :set) {
            System.out.println(o);
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("迭代器输出的"+next);
        }

    }
}

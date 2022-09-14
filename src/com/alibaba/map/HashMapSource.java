package com.alibaba.map;

import java.util.HashMap;
import java.util.Objects;

/**
 * 项目名：    chapter14
 * 文件名：    HashMapSource
 * 创建时间：   2022/9/2 9:30
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class HashMapSource {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 12; i++) {
            hashMap.put(new A(i),"hello");
        }
        System.out.println(hashMap);
    }
}
class A{
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return num == a.num;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
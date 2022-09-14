package com.alibaba.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 项目名：    chapter14
 * 文件名：    Collections_
 * 创建时间：   2022/9/2 10:29
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Collections_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tom");
        arrayList.add("smith");
        arrayList.add("king");
        arrayList.add("milan");
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        System.out.println(arrayList);
    }
}

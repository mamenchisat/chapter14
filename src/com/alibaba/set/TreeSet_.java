package com.alibaba.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 项目名：    chapter14
 * 文件名：    TreeSet
 * 创建时间：   2022/9/2 10:08
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class TreeSet_ {
    public static void main(String[] args) {
        //当使用无参构造器创建TreeSet时，任然是无序的
        //希望安装字符串大小来排序（按字母表）
        //使用TreeSet提供的构造器，传入比较器
        TreeSet treeSet = new TreeSet();
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        System.out.println(treeSet);

        TreeSet treeSet1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String o11 = (String) o1;
                String o12 = (String) o2;
                return o12.compareTo(o11);
            }
        });
        treeSet1.add("jack");
        treeSet1.add("tom");
        treeSet1.add("sp");
        treeSet1.add("ssr");
        System.out.println(treeSet1);
    }
}

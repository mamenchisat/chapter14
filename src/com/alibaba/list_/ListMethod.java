package com.alibaba.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名：    chapter14
 * 文件名：    ListMethod
 * 创建时间：   2022/8/31 10:21
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        list.add(1,"刘备");
        System.out.println(list);

        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("mark");
        list.add(1,list2);
        System.out.println(list);
    }
}

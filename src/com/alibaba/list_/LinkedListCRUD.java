package com.alibaba.list_;

import java.util.LinkedList;

/**
 * 项目名：    chapter14
 * 文件名：    LinkedListCRUD
 * 创建时间：   2022/8/31 15:27
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("ojbk");
        linkedList.add(1,"ok");
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(1);
        linkedList1.add(3);
        linkedList.addAll(1,linkedList1);
        System.out.println(linkedList);
    }
}

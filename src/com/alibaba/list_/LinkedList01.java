package com.alibaba.list_;

/**
 * 项目名：    chapter14
 * 文件名：    LinkedList01
 * 创建时间：   2022/8/31 15:02
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node jerry = new Node("jerry");
        jack.next = tom;
        tom.pre = jack;
        tom.next = jerry;
        jerry.pre = tom;
        Node first = jack;
        Node last = jerry;
        //演示，从头到尾遍历
//        while (true) {
//            if (first != null) {
//                System.out.println(first);
//                first = first.next;
//            } else break;
//        }
//        while (true) {
//            if (last != null) {
//                System.out.println(last);
//                last = last.pre;
//            } else break;
//        }

        //插入对象
        Node smith = new Node("smith");
        smith.next = jerry;
        smith.pre = tom;
        tom.next = smith;
        jerry.pre = smith;
        while (true) {
            if (first != null) {
                System.out.println(first);
                first = first.next;
            } else break;
        }
//        while (true) {
//            if (last != null) {
//                System.out.println(last);
//                last = last.pre;
//            } else break;
//        }
    }

}

class Node {
    public Object item;//真正存放数据的地方
    public Node next;//指向下一个节点

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }

    public Node pre;//指向上一个节点

    public Node(Object name) {
        this.item = name;
    }

}
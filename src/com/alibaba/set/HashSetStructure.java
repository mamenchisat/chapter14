package com.alibaba.set;

/**
 * 项目名：    chapter14
 * 文件名：    HashSetStructure
 * 创建时间：   2022/9/1 10:03
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class HashSetStructure {
    public static void main(String[] args) {
        //创建一个数组Node[]
        Node[] table = new Node[16];
        System.out.println(table);
        //创建节点
        Node jhon = new Node("jhon", null);
        table[2] = jhon;
        Node tom = new Node("tom", null);
        jhon.next = tom;
        table[3] = new Node("lucy",null);
    }
}

class Node {
    public Object item;//真正存放数据的地方
    public Node next;//指向下一个节点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

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
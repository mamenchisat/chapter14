package com.alibaba.list_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 项目名：    chapter14
 * 文件名：    ListExercise02
 * 创建时间：   2022/8/31 10:37
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦", 35, "曹雪芹"));
        list.add(new Book("三国演义", 27, "罗贯中"));
        list.add(new Book("水浒传", 25, "施耐庵"));
        list.add(new Book("西游戏", 40, "吴承恩"));
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book n1 = (Book) o1;
                Book n2 = (Book) o2;
                int num1 = n1.getPrice();
                int num2 = n2.getPrice();
                return num1-num2;
            }
        });
        System.out.println(list);
    }
}

class Book {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    private String author;
}
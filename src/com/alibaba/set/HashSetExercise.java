package com.alibaba.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * 项目名：    chapter14
 * 文件名：    HashSetExercise
 * 创建时间：   2022/9/1 11:18
 *
 * @author crazy Chen
 * 描述：   定义一个Employee，当Employee的name和age相同，视为同一个对象，不能加入HashSet中   TODO
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("milan",18));
        hashSet.add(new Employee("milan",18));
        hashSet.add(new Employee("mark",19));
        System.out.println(hashSet);
        //解决方法，如果name和age相同，则返回同样的hash值
    }
}
class Employee{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //重写hashcode方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
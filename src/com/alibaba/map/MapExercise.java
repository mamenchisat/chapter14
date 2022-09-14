package com.alibaba.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 项目名：    chapter14
 * 文件名：    MapExercise
 * 创建时间：   2022/9/1 22:32
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class MapExercise {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, new Employee("tom", 30000, 1));
        map.put(2, new Employee("jack", 30000, 2));
        map.put(3, new Employee("five", 3000, 3));
        //遍历
        //1，key-set
        Set set = map.keySet();
        for (Object key : set) {
            Employee o = (Employee) map.get(key);
            if (o.getSalary() >= 18000) {
                System.out.println(o);
            }
        }
        //2.entrySet
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Employee value = (Employee)entry.getValue();
            if(value.getSalary()>=18000){
                System.out.println(value);
            }
        }
    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
}
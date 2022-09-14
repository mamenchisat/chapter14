package com.alibaba.map;

import java.util.*;

/**
 * 项目名：    chapter14
 * 文件名：    MapFor
 * 创建时间：   2022/9/1 22:12
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("鹿晗", "关晓彤");
        map.put(null, "刘亦菲");
        //第一种，先取出所有的key,再通过Key取出所有的value
        Set set = map.keySet();
        for (Object o : set) {
            System.out.println(o + "-" + map.get(o));
        }
        System.out.println("===============");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next+"-"+map.get(next));
        }
        System.out.println("===============");
        //第二类方法
        System.out.println(map.values());
        Collection values = map.values();
        for (Object o :values) {
            System.out.println(o);
        }
        //第三类方法，通过EntrySet来获取
        Set entrySet = map.entrySet();//EntrySet<Map.Entry<k,v>>
        for (Object entry :entrySet) {
            //将entry对象转成map.Entry
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }

    }
}

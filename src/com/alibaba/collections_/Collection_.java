package com.alibaba.collections_;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 项目名：    chapter14
 * 文件名：    Collection_
 * 创建时间：   2022/8/31 9:18
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Collection_ {
    //主要分两组，一组是单列集合，一种是双列集合
    //Collection有两个重要的接口，一个是lis，一个是set，是单列集合
    //Map接口的实现子类 是双列集合，存放的是key-value
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");

        HashMap hashMap = new HashMap();
        hashMap.put("n01","jack");
        hashMap.put("n02","tom");

    }
}

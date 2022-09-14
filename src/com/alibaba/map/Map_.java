package com.alibaba.map;
import java.util.HashMap;
import java.util.Map;

/**
 * 项目名：    chapter14
 * 文件名：    Map
 * 创建时间：   2022/9/1 21:53
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("n01","hsp");
        map.put("n02","zhangwuji");
        map.put("n01","czr");
        System.out.println(map);
    }
}

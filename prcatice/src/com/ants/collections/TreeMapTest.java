package com.ants.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        //doesn't allow null key , multiple null values are allowed
        Map<Object,String> treeMap = new TreeMap<>();
        treeMap.put("a","bru");
        treeMap.put("b","aru");
        treeMap.put("c",null);
        treeMap.put("d",null);

        System.out.println(treeMap);
    }
}

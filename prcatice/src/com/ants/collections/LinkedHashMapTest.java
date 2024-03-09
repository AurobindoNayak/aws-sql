package com.ants.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        Map<Object,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a","bru");
        linkedHashMap.put(1,"aru");
        linkedHashMap.put(null,null);
        linkedHashMap.put(null,null);

        System.out.println(linkedHashMap);
    }
}

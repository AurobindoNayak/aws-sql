package com.ants.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("a","aru");
        hashMap.put("b","bru");
        hashMap.put(null,null);
        hashMap.put(null,null);

        System.out.println(hashMap);

        for(Map.Entry entry : hashMap.entrySet()){
            if(entry.getKey()==("a")){
                System.out.println(entry.getValue());
            }
        }

    }
}

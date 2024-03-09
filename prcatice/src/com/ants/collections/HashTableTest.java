package com.ants.collections;

import java.util.Hashtable;

public class HashTableTest {

    public static void main(String[] args) {
        Hashtable<Object,String> hashTable = new Hashtable<>();
        hashTable.put("a","bru");
        hashTable.put(1,"aru");
        hashTable.put("null","null");
       // hashTable.put(null,null);
        System.out.println(hashTable);
    }
}

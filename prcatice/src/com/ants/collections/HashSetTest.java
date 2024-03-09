package com.ants.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set<Object> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(1);
        System.out.println(hashSet);
    }
}

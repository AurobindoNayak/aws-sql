package com.ants.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add(String.valueOf(10));
       // treeSet.add(null);
       // treeSet.add(null);
       // treeSet.add(1);
        System.out.println(treeSet);
    }
}

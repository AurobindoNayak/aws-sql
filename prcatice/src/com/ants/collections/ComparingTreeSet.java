package com.ants.collections;

import java.util.Set;
import java.util.TreeSet;

public class ComparingTreeSet {

    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>(new ComparatorTest());
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add(String.valueOf(10));
        treeSet.add("c");
        treeSet.add("d");
        System.out.println(treeSet);
    }
}

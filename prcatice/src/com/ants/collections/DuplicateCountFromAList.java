package com.ants.collections;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCountFromAList {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,4,5,5);
        Set<Integer> l1 = l.stream().filter(x-> Collections.frequency(l,x)>1)
                              .collect(Collectors.toSet());
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        System.out.println(l1);

        Set<Integer> collect = l.stream().filter(x -> s1.add(x)==false).collect(Collectors.toSet());
        System.out.println(collect);

        for (Integer i : l){
            if(s2.add(i)==false){
                System.out.println(i);
            }
        }
    }
}

package com.ants.feb17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCount {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,4,5,5);
        int sum = l.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
        List<Integer> l1 = l.stream().filter(x-> Collections.frequency(l,x)>1).collect(Collectors.toList());
        System.out.println(l1);

        String s = "123456";
        int summing = Arrays.asList(s.split("")).stream().mapToInt(Integer::parseInt).sum();
        System.out.println(summing);
    }
}

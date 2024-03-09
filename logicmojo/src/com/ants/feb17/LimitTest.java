package com.ants.feb17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitTest {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        List<Integer> l1 = l.stream().skip(2).limit(3).collect(Collectors.toList());
        System.out.println(l1);
    }
}

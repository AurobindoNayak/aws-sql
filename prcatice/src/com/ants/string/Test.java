package com.ants.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
//        List<Double> d = Arrays.asList(10.5,12.5,8.5,50.2);
//        List<Double> collect = d.stream().sorted((x, y) -> Double.compare(y, x)).collect(Collectors.toList());
//        System.out.println(collect);

        String s = "javab";
        int length = s.length();
        if (length % 2 != 0) {
            String s1 = s.substring(s.length() - 1);
            System.out.println(s1);
            s = s.substring(0, s.length() - 1);
            System.out.println(s);
        }
        List<String> l1 = Arrays.asList(s.split("", s.length()%2));
        System.out.println(l1);


    }
}

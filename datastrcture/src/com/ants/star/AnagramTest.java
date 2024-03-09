package com.ants.star;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramTest {

    public static void main(String[] args) {
        String s = "abc";
        String s1 = "bca";

        Map<String,Long> m1 =  Arrays.asList(s.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<String,Long> m2 =  Arrays.asList(s1.split("")).stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        if(m1.equals(m2)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

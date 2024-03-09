package com.ants.feb17;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        String s = "array";
        String s1 = Arrays.asList(s.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(s1);
    }
}

package com.ants.collections;

import java.util.Arrays;
import java.util.OptionalInt;

public class SummingInteger {

    public static void main(String[] args) {
        int a = 123456;
        String s = String.valueOf(a);
        int sum = Arrays.asList(s.split("")).stream().mapToInt(Integer::parseInt).sum();

        System.out.println(sum);

    }
}

package com.ants.star;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IronMountain {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        Integer sum = l.stream().filter(x->x>2).reduce((a,b)->a+b).get();
        System.out.println(sum);

        Integer sum1 = l.stream().filter(x->x>2).mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

    }
}

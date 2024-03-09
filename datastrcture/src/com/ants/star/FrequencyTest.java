package com.ants.star;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyTest {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 1, 4};
        int value = getCount(nums);
        System.out.println(value);
    }

    public static int getCount(int[] values) {
        Long value = 0L;
        List<Long> l2 = new ArrayList<>();
        List<Integer> l1 = Arrays.stream(values).boxed().collect(Collectors.toList());
        Map<Integer, Long> m1 = l1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(m1);
        for (Map.Entry entry : m1.entrySet()) {
            l2.add((Long) entry.getValue());
        }
        Collections.sort(l2);
        System.out.println(l2);
        if (l2.get(0) == l2.get(l2.size() - 1)) {
            value = l2.stream().reduce((a, b) -> a + b).get();
        } else if (l2.get(l2.size() - 1) == l2.get(l2.size() - 2)) {
            value = l2.get(l2.size() - 1) + l2.get(l2.size() - 1);
        } else if (l2.get(l2.size() - 1) != l2.get(l2.size() - 2)) {
            value = l2.get(l2.size() - 1);
        }
        return Math.toIntExact(value);
    }
}

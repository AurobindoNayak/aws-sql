package com.sony;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplictaes {

    public static void main(String[] args) {
//        List<Integer> l = Arrays.asList(11,81,18,49,111,98,98,32,11);
//        Set<Integer> s = new HashSet<>();
//        Set<Integer> s1= l.stream().filter(x->s.add(x)==false).collect(Collectors.toSet());
//        System.out.println(s1);

        String s = "AAAAABBCCAA";
        List<String> s1 = Arrays.asList(s.split(""));
        int start = 0;
        int end = s1.size() - 1;
        while (start <= end) {
            Map<Integer, String> map = new LinkedHashMap<>();
            if (start + 1 <= end && s1.get(start).equals(s1.get(start + 1))) {
                map.put(start + 1, s1.get(start));
                start++;
            } else {
                map.put(start + 1, s1.get(start));
                start++;

            }

            System.out.println(map);

        }

    }
}

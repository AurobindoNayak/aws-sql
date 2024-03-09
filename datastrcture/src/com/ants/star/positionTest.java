package com.ants.star;

import java.util.*;

public class positionTest {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 7, 7, 8, 4, 5, 7);
        System.out.println(findIndex(l1,7));
    }

    public static Map<Integer, Integer> findIndex(List<Integer> list, Integer number) {
        LinkedHashMap map = new LinkedHashMap();
        int first_index = 0;
        int last_index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                first_index = i;
                break;
            }

        }
        for (int i = list.size()-1; i > 0; i--) {
            if (list.get(i) == number) {
                last_index = i;
                break;
            }

        }
        map.put(first_index, last_index);
        return map;


    }
}

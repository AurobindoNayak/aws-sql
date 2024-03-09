package com.ants.star;

import java.util.Arrays;
import java.util.List;

public class BinarySearchWithCeiling {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19);
        System.out.println(findTargetElement(l, 17));
    }

    public static int findTargetElement(List<Integer> list, Integer target) {
        int start = 0;
        int end = list.size();
        int mid = 0;
        for (int i = 0; i <= list.size(); i++) {
            mid = start + (end - start) / 2;
            if (target > list.get(mid)) {
                start = mid + 1;
            } else if (target < list.get(mid)) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return list.get(mid);
    }
}

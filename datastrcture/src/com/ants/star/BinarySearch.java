package com.ants.star;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        int index = getIndexOfPath(l, 11);
        System.out.println(index);

        List<Integer> l1 = Arrays.asList(14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        int index1 = getIndexOfPathDescending(l1, 11);
        System.out.println(index1);
    }

    public static int getIndexOfPath(List<Integer> list, Integer number) {
        Integer start = 0;
        Integer end = list.size();
        Integer mid;
        while (start <= end) {
            if (list.size() > 0) {
                mid = start + (end - start) / 2;
                if (number == list.get(mid)) {
                    return mid;
                }
                if (number > list.get(mid)) {
                    start = mid + 1;
                } else if (number < list.get(mid)) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    public static int getIndexOfPathDescending(List<Integer> list, Integer number) {
        Integer start = list.size();
        Integer end = 0;
        Integer mid;
        while (start >= end) {
            if (list.size() > 0) {
                mid = start + (end - start) / 2;
                //System.out.println(mid);
                if (number > list.get(mid)) {
                    start = mid + 1;
                } else if (number < list.get(mid)) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}

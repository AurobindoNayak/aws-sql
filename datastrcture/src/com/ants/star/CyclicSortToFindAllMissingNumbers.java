package com.ants.star;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSortToFindAllMissingNumbers {

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 7, 8, 2, 3, 1};
        sort(a);
        System.out.println(Arrays.toString(a));
        List<Integer> l = findAllMissingElements(a);
        System.out.println(l);
    }

    private static void sort(int[] a) {
        int i = 0;
        while (i < a.length) {
            if (a[i] != a[a[i] - 1]) {
                swap(a, i, a[i] - 1);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] a, int i, int i1) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }

    private static List<Integer> findAllMissingElements(int[] a) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            if (i != a[i] - 1) {
                l.add(i + 1);
            }
        }
        return l;
    }
}


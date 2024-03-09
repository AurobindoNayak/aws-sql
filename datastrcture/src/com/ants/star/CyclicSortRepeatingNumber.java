package com.ants.star;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSortRepeatingNumber {

    public static void main(String[] args) {
        //int[] a = {2, 1, 3, 4, 2, 3, 7, 8};
        int[] a = {2, 1, 3, 4, 5, 3, 7, 8};
        sort(a);
        System.out.println(Arrays.toString(a));
        List<Integer> l = findAllRepeatingNumber(a);
        System.out.println(l);

    }

    public static void sort(int[] a) {
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

    public static List<Integer> findAllRepeatingNumber(int[] a) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (i != a[i] - 1) {
                l.add(a[i]);
                System.out.println("Missing element is "+ (i+1));
            }
        }
        return l;
    }

}

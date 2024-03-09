package com.ants.star;

import java.util.Arrays;

public class CyclicSortMissingNumber {

    public static void main(String[] args) {
        int[] a = {5, 6, 3, 4, 1, 2, 0, 8};
        sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(findMissingNumber(a));

    }

    public static void sort(int[] a) {
        int i = 0;
        while (i < a.length) {
            //because we have 1 index missing
            //so if we try to put the highest value in to it's respective index
            //we will be encountered with index out of bound exception
            //so we've to check a[i] < a.length
            if (a[i] < a.length && i != a[i]) {
                swap(a, i, a[i]);
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

    private static int findMissingNumber(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != i) {
                return i;
            }
        }
        return 0;
    }
}

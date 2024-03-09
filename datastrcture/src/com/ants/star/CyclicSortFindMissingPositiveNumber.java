package com.ants.star;

import java.util.Arrays;

public class CyclicSortFindMissingPositiveNumber {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7, -1, -3, -2, 3, 6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        int i = 0;
        while (i < a.length) {
            if (a[i] > 0 && a[i] < a.length && a[i] != a[a[i] - 1]) {
                swap(a, i, a[i]-1);
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
}

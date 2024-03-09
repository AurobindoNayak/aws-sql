package com.ants.binarysearch;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] a = {6, 3, 5, 1, 4, 2};
        doSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void doSort(int[] a) {
        int start = 0;
        while (start < a.length) {
            if (start == a[start] - 1) {
                start++;
            } else {
                swap(a, start, a[start] - 1);
            }
        }
    }

    private static void swap(int[] a, int i, int i1) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }
}

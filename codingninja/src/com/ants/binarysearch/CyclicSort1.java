package com.ants.binarysearch;

import java.util.Arrays;

public class CyclicSort1 {

    public static void main(String[] args) {
        int[] a = {6, 3, 5, 1, 4, 2, 7};
        doSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void doSort(int[] a) {
        int start = 0;
        int end = a.length;
        while (start < end) {
            if (start == a[start] - 1) {
                start++;
            } else {
                swap(a, start, a[start] - 1);
            }
        }
    }

    private static void swap(int[] a, int start, int i) {
        int temp = a[start];
        a[start] = a[i];
        a[i] = temp;
    }


}

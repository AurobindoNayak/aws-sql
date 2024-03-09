package com.ants.binarysearch;

import java.util.Arrays;

public class CyclicSort3 {
    static  int count=0;
    public static void main(String[] args) {
        int[] a = {8, 6, 2, 5, 1};
        doSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void doSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j]>a[j+1]) {
                    swap(a, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int i1) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }

}

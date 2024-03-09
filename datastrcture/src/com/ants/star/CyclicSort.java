package com.ants.star;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] a = {4, 3, 5, 1,6};
        sort(a);
        System.out.println(Arrays.toString(a));

    }

    public static void sort(int[] a) {
        int i = 0;
        while (i < a.length-1) {
            if (i == a[i] - 1) {
                i++;
            } else {
                swap(a, i, a[i] - 1);
            }
        }
    }

    private static void swap(int[] a, int i, int i1) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }


}


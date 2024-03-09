package com.ants.star;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {5, 8, 1, 3, 2, 4, 20};
        int start = 0;
        for (int i = start; i < a.length; i++) {
            int end = a.length - 1 - i;
            int max = findLargestElementIndex(a, start, end);
            //we need to swap the lastIndex with the max index
            swap(a, end, max);

        }
        System.out.println(Arrays.toString(a));
    }

    public static int findLargestElementIndex(int[] a, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] a, int end, int max) {
        int temp = a[end];
        a[end] = a[max];
        a[max] = temp;

    }
}

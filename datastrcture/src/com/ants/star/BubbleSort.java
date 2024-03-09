package com.ants.star;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 15, 10, 8, 20, 2};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;

                }
            }
        }
    }
}

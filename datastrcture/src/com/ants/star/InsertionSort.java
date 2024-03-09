package com.ants.star;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {5, 3, 6, 1, 2, 8};
        makeCorrectPosition(a);
        System.out.println(Arrays.toString(a));
    }

    static void makeCorrectPosition(int[] a) {

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                }else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] a, int end, int max) {
        int temp = a[end];
        a[end] = a[max];
        a[max] = temp;

    }
}

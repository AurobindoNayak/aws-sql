package com.ants.feb17;

import java.util.Arrays;

public class ReversingArray {

    public static void main(String[] args) {
        int[] a = {20, 10, 19, 20, 21, 15, 18, 25};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}

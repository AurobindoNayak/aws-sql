package com.ants.feb17;

import java.util.Arrays;

public class SwappingZeroesToLast {

    public static void main(String[] args) {
        int[] a = {10, 0, 20, 30, 40};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                System.out.println(Arrays.toString(a));
                count++;
            }
        }
    }
}

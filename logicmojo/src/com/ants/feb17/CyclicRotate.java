package com.ants.feb17;

import java.util.Arrays;

public class CyclicRotate {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
//        for (int j = 0; j < 2; j++) {
//            int temp = a[0];
//            for (int i = 1; i < a.length; i++) {
//                a[i - 1] = a[i];
//            }
//            a[a.length - 1] = temp;
//            System.out.println(Arrays.toString(a));
//        }
        int d = 3;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = a[i];

        }
        System.out.println(Arrays.toString(temp));
        for (int i = d; i < a.length; i++) {
            a[i - d] = a[i];
        }
        System.out.println(Arrays.toString(a));

        int count = 0;
        for (int i = a.length - d; i < a.length; i++) {
            a[i] = temp[count];
            count++;
        }
        System.out.println(Arrays.toString(a));
    }
}

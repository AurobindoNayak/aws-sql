package com.ants.feb17;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class RemovingDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 20, 30, 30, 30, 40, 40, 50};
        //int[] a = {10, 10, 10, 10, 10};
//        int start = 0;
//        int end = a.length - 1;
//        while (start < end - 1) {
//            if (a[start] != a[start + 1]) {
//                start++;
//            } else {
//                a = ArrayUtils.remove(a, start);
//                end = a.length;
//            }
//
//        }
//        System.out.println(Arrays.toString(a));

        int result = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[result - 1]) {
                a[result] = a[i];
                result++;
                System.out.println(a[result]);

            }
        }
        System.out.println(result);

    }

}

package com.ants.algorithis;

import java.util.Arrays;

public class RemoveDuplicateElementsFromAnArray {
//    Input: nums = [3,2,2,3], val = 3
//    Output: 2, nums = [2,2,_,_]
//    Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//    It does not matter what you leave beyond the returned k (hence they are underscores).

    public static void main(String[] args) {
        int[] a = {3, 2, 2, 3, 3};
        int target = 3;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != target) {
                int temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                count++;
                System.out.println(Arrays.toString(a));
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(a));
    }
}

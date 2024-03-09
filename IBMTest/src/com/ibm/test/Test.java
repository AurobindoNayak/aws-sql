package com.ibm.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
//        Given an array of integers, find the contiguous subarray (containing at least one number)
//        which has the largest sum and return the sum.
//                Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//        Output: 6
//        Explanation: The contiguous subarray [4, -1, 2, 1] has the largest sum = 6.
//        Input: [1, 2, 3, -2, 5]
//        Output: 9
//        Explanation: The contiguous subarray [ 3, -2, 5] has the largest sum = 9.


        //1- lets calculate the sum of the entire array
        //
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArraySum(a);
        System.out.println(result);
        int sum = 0;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            sum = a[i];
            for (int j = i + 1; j < a.length; j++) {
                sum = sum + a[j];
                l.add(sum);
            }

        }

        Integer highest = l.stream().sorted((x, y) -> y - x).findFirst().get();
       // System.out.println(highest);

        //with big O of n approach


    }

    public static int maxSubArraySum(int[] a) {
        int maxSum = a[0];
        int currentSum = a[0];

        for (int i = 1; i < a.length; i++) {
            // Choose between extending the current subarray or start a new one
            currentSum = Math.max(a[i], currentSum + a[i]);
            System.out.println("currentSum is" + currentSum);
            // Update the maximum sum
            maxSum = Math.max(maxSum, currentSum);
            System.out.println("maxSum is" +maxSum );
        }

        return maxSum;
    }

}

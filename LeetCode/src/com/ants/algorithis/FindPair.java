package com.ants.algorithis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPair {

//    Given an array of integers nums and an integer target, return indices of the two numbers
//    such that they add up to target.
//    You may assume that each input would have exactly one solution,
//    and you may not use the same element twice.
//    You can return the answer in any order.
//    Example 1:
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//    Example 2:
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]

    public static void main(String[] args) {
        int[] a = {3, 2, 4};
        //Arrays.sort(a);
        List<List<Integer>> pairs = findPair(a, 6);
        System.out.println(pairs);
        int[] x = findPairs(a, 6);
        System.out.println(Arrays.toString(x));
    }

    public static List<List<Integer>> findPair(int[] a, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int sum = a[start] + a[end];
            System.out.println("sum" + sum);
            if (sum == target) {
                List<Integer> l = new ArrayList<>();
                l.add(start);
                l.add(end);
                pairs.add(l);
                start++;
                end--;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return pairs;
    }

    public static int[] findPairs(int[] a, int target) {

        int start = 0;
        int end = a.length - 1;
        int[] pairs = new int[2];
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < a.length; j++) {
                 if(a[i]+a[j]==target){
                     pairs[0]=i;
                     pairs[1]=j;
                 }
            }
        }
        return pairs;
    }
}

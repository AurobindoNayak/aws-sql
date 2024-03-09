package com.ants.star;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IBMTest1 {

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 7, 9, 6};
        List<List<Integer>> pair = findAllPossiblePairs(a, 7);
        System.out.println(pair);
    }

    private static List<List<Integer>> findAllPossiblePairs(int[] a, int num) {
        Arrays.sort(a);
        List<List<Integer>> pairs = new ArrayList<>();
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == num) {
                List<Integer> l = new ArrayList<>();
                l.add(a[left]);
                l.add(a[right]);
                left++;
                right--;
                pairs.add(l);
            } else if (sum < num) {
                left++;
            } else {
                right--;
            }
        }
        return pairs;
    }
}

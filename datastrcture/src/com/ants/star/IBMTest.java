package com.ants.star;

import java.util.ArrayList;
import java.util.List;

public class IBMTest {

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 7, 9, 6};
        List<List<Integer>> pair = findAllPossiblePairs(a);
        System.out.println(pair);
    }


    private static List<List<Integer>> findAllPossiblePairs(int[] a) {
        List<List<Integer>> pairs = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for (int n : a) {
            l.add(n);
        }

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if (l.contains(sum)) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(a[i]);
                    pair.add(a[j]);
                    pairs.add(pair);
                }

            }
        }
        return pairs;
    }
}

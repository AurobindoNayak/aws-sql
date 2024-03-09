package com.ants.star;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IBMTest2 {

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 7, 9, 6};
        List<Integer> l = new ArrayList<>();
        Arrays.sort(a);
        for (int i : a) {
            l.add(i);
        }
        System.out.println(l);
        List<List<Integer>> pair;
        for(int x : l) {
            pair = findAllPossiblePairs(a, x);
            System.out.println(pair);
        }

    }

    private static List<List<Integer>> findAllPossiblePairs(int[] a, int target) {
        int start =0;
        int end = a.length-1;
        List<List<Integer>> pair = new ArrayList<>();
        while(start<end){
            int sum = a[start]+a[end];
            if(sum==target){
                List<Integer> l = new ArrayList<>();
                l.add(a[start]);
                l.add(a[end]);
                pair.add(l);
                start++;
                end--;
                //System.out.println(pair);
            } else if (sum<target) {
                start++;
            }else{
                end--;
            }
        }

        return pair;
    }
}

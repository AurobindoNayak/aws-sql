package com.ants.star;

import java.util.ArrayList;
import java.util.List;

public class Deloitte {

    static int start = 0;
    static int index = 0;
    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,4,6,3};
        start = index;
        List<Integer> index = getIndex(a,3,start);
        System.out.println(index);
    }

    public static List<Integer> getIndex(int[] a, int target, int start){

        List<Integer> l = new ArrayList<>();
        for(int i = start ; i<= a.length-1; i++){
            if(a[i]==target){
                l.add(i);
            }
        }
        return l;
    }
}

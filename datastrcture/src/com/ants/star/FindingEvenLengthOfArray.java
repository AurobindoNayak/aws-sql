package com.ants.star;

import java.util.Arrays;
import java.util.List;

public class FindingEvenLengthOfArray {

    public static void main(String[] args) {
        Integer[] a = {12, 6, 3, 359, 8965};
        List<Integer> l = Arrays.asList(a);
        for (int x : l) {
            if (String.valueOf(x).length() % 2 == 0) {
                System.out.println(x);
            }
        }

        for (int i : a) {
            if (String.valueOf(i).length() % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i : a) {
//            if ((Math.log10(i)+1) %2 == 0) {
                //System.out.println((int) (Math.log10(i)+1));
            //}
            if((int) (Math.log10(i)+1)%2==0){
                System.out.println(i);
            }
        }
    }


}

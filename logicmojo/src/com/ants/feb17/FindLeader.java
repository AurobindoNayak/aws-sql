package com.ants.feb17;

public class FindLeader {

    public static void main(String[] args) {
        int[] a = {7, 10, 4, 3, 6, 6, 5, 2};
        int highest = a[a.length - 1];
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > highest) {
                highest = a[i];
                System.out.println(a[i]);
            }
        }
    }
}

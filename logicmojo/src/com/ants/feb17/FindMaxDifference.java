package com.ants.feb17;

public class FindMaxDifference {

    public static void main(String[] args) {
        int[] a = {2, 3, 10, 6, 4, 8, 1};
        int diff = a[a.length - 1] - a[a.length - 2];
        // i = 0; j=i+1, we need to check the difference j-i not i-j
        // means 10-2 = 8 (2 is i and 10 is j) is the answer not 10-1 (because 10 is i and 1 is j)
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] - a[j] > diff) {
                    diff = a[i] - a[j];
                }
            }
            System.out.println(diff);
        }
    }
}

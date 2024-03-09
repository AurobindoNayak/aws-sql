package com.ants.feb17;

public class BiggestIntegerInanArray {

    public static void main(String[] args) {

        int[] a = {5, 2, 15, 20, 6, 8, 30, 21};
        int big = findBiggestInteger(a);
        System.out.println(big);

    }

    private static int findBiggestInteger(int[] a) {
        int biggest = 0;
        for (int j : a) {
            if (j > biggest) {
                biggest = j;
            }
        }
        return biggest;
    }
}

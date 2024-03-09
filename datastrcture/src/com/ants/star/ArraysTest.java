package com.ants.star;

public class ArraysTest {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int a1[] = {1, 2, 3, 4, 5};
        Object o[] = {"hello", true, false, 4, 2.3};
        System.out.println(a1[1]);

        int aa[][] = {{1, 2, 3}, {3, 4}, {5, 6, 7, 8, 9}};
        System.out.println(aa[2][2]);
        for (int row = 0; row < aa.length; row++) {
            for (int column = 0; column < aa[row].length ; column++){
                System.out.print(aa[row][column]+" ");
            }
            System.out.println(" ");
        }

    }
}

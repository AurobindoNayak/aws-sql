package com.ants.star;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LinearSearchIn2DArray {

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {3, 4},
                {5, 6, 7, 8, 9}
        };

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                if (a[row][column] == 3) {
                    System.out.println(Arrays.toString(new int[]{row, column}));
                }
            }
        }

        int max = 0;
        for (int arr[] : a) {
            for (int inner : arr) {
                if (inner > 0) {
                    max = inner;
                }
            }

        }

        List<int[]> x = Arrays.stream(a).collect(Collectors.toList());
        System.out.println("x is" + x);


        System.out.println(max);
        Integer[][] a1 = {
                {1, 2, 3},
                {3, 4},
                {5, 6, 7, 8, 9}
        };
        List<Integer> list = new ArrayList<>();
        for (Integer[] array : a1) {
            list.addAll(Arrays.asList(array));
        }

        //List<Integer> list1 = Arrays.stream(a1).flatMap(Arrays::stream).sorted((o1,o2)->(o1-o2)).findFirst().get();
        Integer value = Arrays.stream(a1).flatMap(Arrays::stream).sorted((o1,o2)->(o2-o1)).findFirst().get();
        System.out.println(value);
    }
}

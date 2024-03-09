package com.ants.feb17;

import java.util.Arrays;

public class LeftRotateArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int rotate_cycle = 2;
        //1- 1st remove the element of size 2 from the array i.e. 1,2
        int temp[] = new int[rotate_cycle]; // creating a size of array 2
        for (int i = 0; i < rotate_cycle; i++) {
            temp[i] = a[i];
        }
        System.out.println(Arrays.toString(temp));
        //2- shift the reaming elements to the 1st position accordingly i.e 3,4,5,4,5
        for (int i = rotate_cycle; i < a.length; i++) {
            a[i - rotate_cycle] = a[i];

        }
        System.out.println(Arrays.toString(a));

        //3- now insert the temp[] at the end;
        int count = 0;
        for (int i = a.length - rotate_cycle; i < a.length; i++) {
            a[i] = temp[count];
            count++;
        }

        System.out.println(Arrays.toString(a));
    }
}

package com.ants.feb17;

import static org.apache.commons.lang3.math.NumberUtils.max;
import static org.apache.commons.lang3.math.NumberUtils.min;

public class FindMaxDifferenceInOofNtime {

    public static void main(String[] args) {
        int[] a = {2, -2, 3, 10, 6, 4, 8, 1};
        int diff = a[1] - a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            diff = max(diff, a[i] - min);
            min = min(min, a[i]);
            System.out.println("min is" + min);

        }
        System.out.println(diff);


    }
}

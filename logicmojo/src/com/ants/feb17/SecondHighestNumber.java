package com.ants.feb17;

public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] a = {20, 10, 19, 20, 21, 15, 18, 25};
        int secondHighest = findSecondLargestNumber(a);
        System.out.println(secondHighest);

    }

    public static int findSecondLargestNumber(int[] a) {
        int highest = a[0];
        int secondHighest = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > highest) {
                secondHighest = highest;
                highest = a[i];
            } else if (a[i] != highest && a[i] > secondHighest) {
                secondHighest = a[i];
            }
        }
        return secondHighest;
    }

}

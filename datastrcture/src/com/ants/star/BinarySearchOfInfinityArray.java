package com.ants.star;

public class BinarySearchOfInfinityArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(calculateStartAndEnd(a, 7));
    }

    public static int calculateStartAndEnd(int[] a, int target) {
        int start = 0;
        int end = 1;
        while (target > a[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return findFirstIndex(a, target, start, end);
    }

    public static int findFirstIndex(int[] a, int target, int start, int end) {
        int mid = 0;
        System.out.println("start:: "+start +" end:: "+end);
        while (start <= end) {
           mid = start + (end - start) / 2;
            if (target > a[mid]) {
                start = mid + 1;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else  {
                return mid;
            }
        }
        return mid;
    }
}

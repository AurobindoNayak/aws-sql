package com.ants.star;

public class BinarySearchMountain {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 6, 15, 10, 3, 1};
        System.out.println(findPickIndex(a));
        // System.out.println(findLeft(a,3, findPickIndex(a)));
        System.out.println(findRight(a, 3, findPickIndex(a)));

    }

    public static int findPickIndex(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] > a[mid + 1]) {
                end = mid;
                return end;
            } else if (a[mid] < a[mid + 1]) {
                start = mid + 1;
                return start;
            }

        }
        return -1;
    }

    public static int findLeft(int[] a, int target, int end) {
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] > target) {
                end = mid - 1;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static int findRight(int[] a, int target, int start) {
        int end = a.length - 1;
        System.out.println(start + " " + end);
        for (int i = end; i > start; i--) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

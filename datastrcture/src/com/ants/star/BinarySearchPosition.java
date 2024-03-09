package com.ants.star;

public class BinarySearchPosition {

    public static void main(String[] args) {

        //int[] a = {1, 2, 3, 3, 4, 4, 4, 4, 4, 4, 5, 6};
        int[] a = {1, 2, 3, 3, 4, 4, 4, 4, 4, 4, 5, 6, 7, 7};
        System.out.println(find1stIndex(a, 7));
        System.out.println(findLastIndex(a, 7));

    }

    public static int find1stIndex(int[] a, int target) {
        int start = 0;
        int mid = 0;
        int end = a.length - 1;
        int result = 0;

        {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (a[mid] > target) {
                    end = mid - 1;
                } else if (a[mid] < target) {
                    start = mid + 1;
                } //else {
//                    if (a[mid] == target) {
//                        end = mid - 1;
//                    } else {
//                        start = mid + 1;
//                    }
//                }
                else if (a[mid] == target) {
                    result = mid;
                    end = mid - 1;

                }
            }
        }
       // return start;
        return result;
    }

    public static int findLastIndex(int[] a, int target) {
        int start = 0;
        int mid = 0;
        int end = a.length - 1;
        int result = 0;

        {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (a[mid] > target) {
                    end = mid - 1;
                } else if (a[mid] < target) {
                    start = mid + 1;
                } else if (a[mid] == target) {
                    result = mid;
                    start = mid + 1;

                }
            }
        }
        return result;
    }
}

package com.ants.star;

public class FindingHighest {

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10, 3, 1};
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (a[mid]>a[mid+1]){
                end = mid;
            }
            else if(a[mid]<a[mid+1]){
                start = mid+1;
            }
        }
        System.out.println(end);
    }

}

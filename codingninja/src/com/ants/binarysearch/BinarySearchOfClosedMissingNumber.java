package com.ants.binarysearch;

public class BinarySearchOfClosedMissingNumber {

    public static void main(String[] args) {
        int[] a = {
                8, 19, 20, 29, 37, 42, 44, 60, 75, 96, 103, 104, 121, 129, 135, 151, 166, 179, 195, 200, 220, 238, 266, 270, 292, 300, 306, 311, 328, 335, 343, 363, 366, 380, 391, 409, 411, 432, 436, 448, 472, 482, 522, 525, 537, 543, 555, 564, 565, 569, 580, 587, 588, 589, 590, 606, 607, 617, 635, 644, 649, 664, 675, 678, 680, 681, 694, 708, 734, 741, 746, 753, 754, 766, 779, 787, 791, 799, 800, 813, 822, 840, 842, 885, 886, 888, 894, 902, 915, 926, 932, 935, 944, 946, 953, 955, 957, 962, 968, 987
                , 999
        };

        int index = findCloseMissingNumberIndex(a, 78);
        System.out.println(index);


    }

    private static int findCloseMissingNumberIndex(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        int mid = 0;
        while (start < end) {
            mid = (start + end) / 2;
            if (a[mid] < target) {
                start = mid + 1;
            } else if (a[mid] > target) {
                end = mid;
            } else {
                return mid;
            }
        }

        if (a[mid] < target && a[mid + 1] > target) {
            if ((target - a[mid]) < (a[mid + 1]) - target) {
                return mid;
            }
        } else if (a[mid] > target && a[mid - 1] < target) {
            if ((a[mid] - target) < (target - a[mid - 1])) {
                return mid;
            }
        }
        return mid + 1;
    }
}

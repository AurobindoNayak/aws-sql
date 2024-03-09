package com.ants.star;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BinarySearchTest {

    public static void main(String[] args) {
        char[] c = {'e', 'e', 'e', 'n', 'n', 'n'};
        System.out.println(findSmallestThanTarget(c, 'e'));
    }

//    public static char findSmallestThanTarget(char[] letters, char target) {
//        Set<char[]> s = new LinkedHashSet<>(Arrays.asList(letters));
//        System.out.println(s.stream().map(x->x[1]));
//        int start = 0;
//        int end = letters.length - 1;
//        int mid = 0;
//        for (int i = 0; i < letters.length - 1; i++) {
//            mid = start + (end - start) / 2;
//            if (target == letters[0] ) {
//                //return s.;
//            } else if (target > letters[0] && target < letters[1]) {
//                return letters[1];
//            } else if (target >= letters[letters.length - 1]) {
//                return letters[0];
//            } else if (target > letters[mid]) {
//                start = mid + 1;
//            } else if (target < letters[mid]) {
//                end = mid - 1;
//            } else {
//                return letters[mid + 1];
//            }
//        }
//        return letters[mid];
//    }

    public static char findSmallestThanTarget(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}

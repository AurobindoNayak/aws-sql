package com.ants.test;

import java.util.Arrays;
import java.util.List;

public class ListCopyOfTest {

    public static void main(String[] args) {

        List<String> l = Arrays.asList("Aru", "Aru1", "Aru2");
        System.out.println(l);
        System.out.println(l);

        //List.of means that's immutable we can't make any change to that list. It's used for static values
        List<String> l1 = List.of("Aru", "Aru1", "Aru2");
        System.out.println(l1);

        /* if we try to add any element we are going to get error for line 17*/

        // l1.add("Hello");
        // System.out.println(l1);


        //List.copyOf means also that's immutable we can't make any change to that list.
        List<String> l3 = List.copyOf(l);
        System.out.println(l3);
        l3.add("hello");
        System.out.println(l3);


    }
}

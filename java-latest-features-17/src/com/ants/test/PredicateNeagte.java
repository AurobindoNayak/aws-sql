package com.ants.test;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNeagte {

    //predicate.negate & predicate.not introduced in java 11
    //predicate.negate is used fro a direct reference like line number 12
    //but for method we need to use predicate.not like line 16 as we are calling isEven method

    public static void main(String[] args) {
        List<Integer> l = List.of(1,2,3,4,10,12);
        Predicate<Integer> evenNumber = x->x%2==0;
        l.stream().filter(evenNumber.negate()).forEach(System.out::println);

        l.stream().filter(Predicate.not(PredicateNeagte::isEven)).forEach(System.out::println);
    }

    public static boolean isEven(int number){
        return number%2==0;
    }
}

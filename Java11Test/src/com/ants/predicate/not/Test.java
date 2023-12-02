package com.ants.predicate.not;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5,10,15,20);

        //basically predicate.not will return all the odd numbers
        numbers.stream().filter(Predicate.not(x->x%2==0)).forEach(System.out::println);
    }
}

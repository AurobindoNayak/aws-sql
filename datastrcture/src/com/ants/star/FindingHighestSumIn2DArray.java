package com.ants.star;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindingHighestSumIn2DArray {

    public static void main(String[] args) {
        Integer[][] a1 = {
                {3,2,1},
                {5,6,7}
        };

        Integer[][] a2 = {
                {3,2,1},
                {5,6,7},
                {7,8,9,10}
        };

        System.out.println(getHighest(a1));
    }
    public static List<Integer> getHighest(Integer[][] values){

        List<Integer> l1 = new ArrayList<>();
        for(Integer a[]:values){
            int result =0;
            for(Integer aa : a){
                result = result+aa;
            }
            l1.add(result);
        }
       return l1;
    }

    public static Integer getHighest1(Integer[][] values){

        List<Integer> l1 = Arrays.stream(values).flatMap(Arrays::stream).collect(Collectors.toList());
        Optional<Integer> reduce = l1.stream().reduce((x, y) -> x + y);

        return reduce.get();
    }
}

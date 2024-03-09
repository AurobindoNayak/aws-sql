package com.ants.feb17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindFrequency {

    public static void main(String[] args) {
        int[] a = {10,10,10,20,20};
        int currentElement = a[0];
        int count=0;
        for(int i =0; i<a.length; i++){
            if(currentElement==a[i]){
                count++;
            }else{
                count=1;
                currentElement = a[i];
            }
            System.out.println("number is "+a[i]+" count is "+count);
        }

    }
}

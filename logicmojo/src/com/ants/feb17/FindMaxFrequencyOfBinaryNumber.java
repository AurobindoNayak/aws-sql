package com.ants.feb17;

import static java.lang.Math.max;

public class FindMaxFrequencyOfBinaryNumber {

    public static void main(String[] args) {
        int[] a = {0,1,1,1,1,0,0,1,1};
        int target =1;
        int count = 0;
        for(int i =0; i<a.length; i++){
            if(a[i]==target){
                count++;
            }else{
                count=0;
            }

        }
        System.out.println(count);
    }
}

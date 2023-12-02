package com.ants.test;

public class NumberTest {

    public static void main(String[] args) {
        int number = 1235;
        int sum = 0;
        String s = String.valueOf(number);
        System.out.println(s.length());
        if(s.length()>1){
            int firstDigit = Integer.parseInt(s.substring(0,1)); // Get the first digit
            System.out.println("firstDigit==="+firstDigit);
            int lastDigit = number%10;
            System.out.println(firstDigit+lastDigit);
            for(int i=0 ; i<s.length()-1 ; i++){
               sum = sum+s.charAt(i);
               System.out.println(sum);
           }
        }
    }
    }


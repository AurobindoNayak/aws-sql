package com.ants.star;

public class SplittingString {

    public static void main(String[] args) {
        String s = "aabbccdde";
        String s1 = null;

//        if (s.length() % 2 != 0) {
//            s = s.substring(s.length() - 1);
//            s1 = s;
//        }
        int start = 0;
        int end = 2;
        for (int i = 0; i <s.length()-1; i++) {
            if(end>s.length()){
                break;
            }
            String sub = s.substring(start, end);
            System.out.println(sub);
            start = end;
            end = start + 2;
            System.out.println("start:: " + start + " end:: " + end);
        }


    }
}

package com.ants.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FinalStringTest {

    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("a");
        sb.append("b");
        sb.append(true);
        System.out.println(sb);

        final String s = "a";
        s.concat("b");
        System.out.println(s);

        String s2 = "Aurobindo Nayak Nayak Aurobindo";
        String s3="";
        String s4 = "";
        for(int i=s2.length()-1; i>=0; i--){
           s3 = s3+s2.charAt(i);
        }
        System.out.println(s3);

        List<String> l1 = Arrays.asList(s2.split(" "));
        for(int i=l1.size()-1; i>=0; i--){
            s4 =s4+l1.get(i)+" ";
        }
        System.out.println(s4);
    }
}

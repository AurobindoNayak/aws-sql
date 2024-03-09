package com.sony;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SonyTest {

    public static void main(String[] args) {
        String s = "AAAAABBCCAA";
        List<String> s1 = Arrays.asList(s.split(""));
        String currentValue = s1.get(0);
//        for (int i = 0; i < s1.size() ; i++) {
//            Map<Integer, String> m = new LinkedHashMap<>();
//            if (s1.get(i).equals(currentValue)) {
//                m.put(i + 1, s1.get(i));
//            } else {
//                currentValue = s1.get(i + 1);
//                System.out.println("currentValue is" + currentValue);
//                s1 = s1.subList(i, s1.size());
//                System.out.println("sublist is " + s1);
//                i = -1;
//            }
//            System.out.println(m);
//        }

        for (int i = 0; i < s1.size(); i++) {
            Map<Integer, String> m = new LinkedHashMap<>();
            if (currentValue.equals(s1.get(i))) {
                m.put(i + 1, currentValue);
            }else{
                currentValue = s1.get(i+1);
                System.out.println("currentValue is "+currentValue);
                s1 = s1.subList(i,s1.size());
                System.out.println("sublist is"+s1);
                i=-1;
            }
            System.out.println(m);
        }

    }
}


package com.ants.string;

public class EqualsTest {

    public static void main(String[] args) {
        String s1 = new String("Aru");
        String s2 = new String("Aru");
        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2)); //true

        System.out.println("==========================");

        StringBuffer sb1 = new StringBuffer("Aru");
        StringBuffer sb2 = new StringBuffer("Aru");
        System.out.println(sb1==sb2); //false
        System.out.println(sb1.equals(sb2)); //false

        System.out.println("==========================");


        StringBuilder sbb1 = new StringBuilder("Aru");
        StringBuilder sbb2 = new StringBuilder("Aru");
        System.out.println(sbb1==sbb2); //false
        System.out.println(sbb1.equals(sbb2)); //false
    }
}

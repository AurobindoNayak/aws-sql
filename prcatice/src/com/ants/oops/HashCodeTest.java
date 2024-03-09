package com.ants.oops;

public class HashCodeTest {

    public static void main(String[] args) {
        String s1 = new String("a");
        String s2 = new String("a");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

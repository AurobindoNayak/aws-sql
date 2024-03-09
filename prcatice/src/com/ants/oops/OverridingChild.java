package com.ants.oops;

public class OverridingChild extends OverridingParent {

    public  final String  m1() {
        return "hello";
    }

    public static void main(String[] args) {
      String s = "10s";
      int i = Integer.parseInt(s);
        System.out.println(i);
    }
}

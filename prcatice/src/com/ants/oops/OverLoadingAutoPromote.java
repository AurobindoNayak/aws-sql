package com.ants.oops;

public class OverLoadingAutoPromote {

    public void m1(int a){
        System.out.println("integer method");
    }

    public void m1(float a){
        System.out.println("float method");
    }

    public void m1(double a){
        System.out.println("double method");
    }
    public void m1(String a){
        System.out.println("String method");
    }

    public static void main(String[] args) {
        OverLoadingAutoPromote ol = new OverLoadingAutoPromote();
        ol.m1('a');
    }
}

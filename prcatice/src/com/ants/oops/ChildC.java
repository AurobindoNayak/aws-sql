package com.ants.oops;

public class ChildC implements InterfaceA,InterfaceB{
//    @Override
//    public void m1() {
//        InterfaceA.super.m1();
//    }
    @Override
    public void m1() {
        InterfaceB.super.m1();
    }
    
    public static void main(String[] args) {
        ChildC c = new ChildC();
        c.m1();
    }

}

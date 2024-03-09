package com.ants.oops;

public abstract class AbstractTest {

    public abstract void m1();

    public static void main(String[] args) {
        AbstractTest ab = new AbstractTest() {
            @Override
            public void m1() {
                System.out.println("hi i'm abstract");
            }
        };

        ab.m1();
    }
}

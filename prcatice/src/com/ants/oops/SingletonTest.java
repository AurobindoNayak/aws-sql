package com.ants.oops;

public  class SingletonTest implements Cloneable{

    private static SingletonTest t = null;

    private SingletonTest(){

    }

    public static synchronized SingletonTest getTest(){
        return  t==null ? t= new SingletonTest():t;
    }

    public Object clone() throws CloneNotSupportedException{

        return super.clone();
    }
}

package com.ants.string;

public class ImmutableTest {

    public static void main(String[] args) {
        String s = "aru";
        s=s.concat("nayak");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("aru ");
        sb.append("aru");
        System.out.println(sb);
    }
}

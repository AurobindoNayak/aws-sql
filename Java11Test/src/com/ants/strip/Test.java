package com.ants.strip;

public class Test {

   /* The strip is used to remove the spaces from the beginnging & ending of a String, if present
    If there is any spaces in between a String then no impact */

    public static void main(String[] args) {
        System.out.println(" ".isBlank()); //
        System.out.println(" Aru ".strip()); //remove spaces from beginning & ending
        System.out.println(" Aru ".stripLeading()); //remove spaces from the beginning
        System.out.println(" Aru ".stripTrailing()); //remove spaces from ending
        System.out.println("A r u".strip());// No impact as the space contains in between the String
        System.out.println(" Aru ".stripIndent());
    }
}

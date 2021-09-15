/*
Problem Statement: 
-----------------
Write a program , which will take three strings from the common line and displays
the number of characters in each string.
*/

import java.util.Scanner;

public class StringCharactersProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        System.out.println("Number of Characters in string one is = " + s1.length());
        System.out.println("Number of Characters in string two is = " + s2.length());
        System.out.println("Number of Characters in string three is = " + s3.length());
    }
}

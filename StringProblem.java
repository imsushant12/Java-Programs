/*
Problem Statement:
------------------
Write a program that takes a String through Command Line argument and display the length
of the string. Also display the string into uppercase and check whether it is a palindrome or not.
*/

import java.util.Scanner;

public class StringProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String reverse = "";

        System.out.println("Length of string is = " + s.length());
        System.out.println("Upper Cased String is : " + s.toUpperCase());

        // Checking palndrome:
        for (int i = s.length() - 1; i >= 0; i--)
            reverse = reverse + s.charAt(i);
        if (s.equals(reverse))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string is not a palindrome.");

    }
}

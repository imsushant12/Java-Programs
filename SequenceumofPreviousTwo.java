/*
Problem Statement:
-----------------
Write a program that accepts two numbers from the Command Line and prints them out.
Then use a for loop to print the next 17 numbers in the sequence where each number is the sum of the previous two.
*/

import java.util.Scanner;

public class SequenceumofPreviousTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println("First Number = " + first);
        System.out.println("Second Number = " + second);

        System.out.print("Sequence : ");
        for (int i = 0; i < 17; i++) {
            int sum = first + second;
            System.out.print(sum + "  ");
            first = second;
            second = sum;
        }
    }
}
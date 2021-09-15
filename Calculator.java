/*
Problem Statement:
------------------
Write a program that accepts two numbers and a operator like (+,-,*, /) as command
line arguments and perform the appropriate operation indicated by the operator. If the
user enters any other character the appropriate message will be displayed. The output of
the program should be displayed to the user.
*/

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator : ");
        char operator = sc.next().charAt(0);

        try {
            if (operator == '+')
                System.out.println(num1 + num2);
            else if (operator == '-')
                System.out.println(num1 - num2);
            else if (operator == '*')
                System.out.println(num1 * num2);
            else if (operator == '/')
                System.out.println(num1 / num2);

        } catch (NumberFormatException e) {
            System.out.println("Something went wrong.");
        }
    }
}
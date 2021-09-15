/*
Problem Statement:
-----------------
Write a program that allows you to create an integer array of 18 elements with the
following values: int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0}. The program computes the
sum of element 0 to 14 and stores it at element 15, computes the average and stores it at
element 16 and identifies the smallest value from the array and stores it at element.
12.
*/

public class ArraySequenceProblem {
    public static void main(String[] args) {
        int[] a = new int[] { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0 };

        int sum = 0;
        int min = 99999;
        for (int i = 0; i < 17; i++) {
            if (i < 14)
                sum += a[i];
            if (a[i] < min)
                ;
            min = a[i];
        }

        a[14] = sum;
        a[15] = sum / a.length; // average
        a[16] = min;

        System.out.print("New array becomes : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}
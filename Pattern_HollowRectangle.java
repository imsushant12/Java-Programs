// * * * * *
// *       *
// *       *
// * * * * *

import java.util.Scanner;

public class Pattern_HollowRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        for (int i = 0; i < row; i++) {
            if (i == 0 || i == row - 1)
            {
                for (int j = 0; j < column; j++) {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for (int j = 0; j < column-2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
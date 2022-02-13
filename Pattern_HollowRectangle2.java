// * * * * *
// *       *
// *       *
// * * * * *

import java.util.Scanner;

public class Pattern_HollowRectangle2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == column - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
        sc.close();
    }
}
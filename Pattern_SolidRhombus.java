//      * * * * *
//     * * * * *
//    * * * * *
//   * * * * *
// * * * * *

import java.util.Scanner;

public class Pattern_SolidRhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

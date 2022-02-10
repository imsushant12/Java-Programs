//         *
//       * *
//     * * *
//   * * * *
// * * * * *

import java.util.Scanner;

public class Pattern_InvertedHalfPyramidRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - (i+1); j++) {
                // OR j = 0 to j <= row-i
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                // OR j = 0 to j <= i
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

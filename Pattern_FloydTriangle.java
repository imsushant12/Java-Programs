// 1
// 2 3 
// 4 5 6 
// 7 8 9 10
// 11 12 13 14 15

import java.util.Scanner;

public class Pattern_FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 1;
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
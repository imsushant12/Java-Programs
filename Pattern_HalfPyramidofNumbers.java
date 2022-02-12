// 1 
// 1 2  
// 1 2 3
// 1 2 3 4

import java.util.Scanner;

public class Pattern_HalfPyramidofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            int counter = 1;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

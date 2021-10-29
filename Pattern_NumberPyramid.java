//     1
//    2 2
//   3 3 3
//  4 4 4 4 
// 5 5 5 5 5 

import java.util.Scanner;

public class Pattern_NumberPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int counter = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - counter; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < counter; j++) {
                System.out.print(counter + " ");
            }
            counter++;
            System.out.println();
        }
        sc.close();
    }
}

//     1
//    212
//   32123
//  4321234
// 543212345 

import java.util.Scanner;

public class Pattern_PalindromicNumberPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int counter = 1;
        for (int i = 0; i < row; i++) {
            int x = counter;
            int y = 2;
            for (int j = 0; j < row - counter; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < counter; j++) {
                if (counter > 0)
                    System.out.print(x--);
            }
            for (int j = 0; j < counter; j++) {
                if(y != 0 && y <= counter)
                    System.out.print(y++);
            }
            counter++;
            System.out.println();
        }
        sc.close();
    }
}

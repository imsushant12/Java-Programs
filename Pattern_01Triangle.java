// 1
// 0 1
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1

import java.util.Scanner;

public class Pattern_01Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i + 1; j++) {

                int cellSum = i+j;

                if(cellSum %2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

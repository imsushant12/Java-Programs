/*
Problem Statement:
-----------------
The problem is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints that from each cell you can either move only to right or down.

Examples : 
---------
Input :  row = 2, column = 2;
Output : 2
There are two paths
(0, 0) -> (0, 1) -> (1, 1)
(0, 0) -> (1, 0) -> (1, 1)

Input :  row = 2, column = 3;
Output : 3
There are three paths
(0, 0) -> (0, 1) -> (0, 2) -> (1, 2)
(0, 0) -> (0, 1) -> (1, 1) -> (1, 2)
(0, 0) -> (1, 0) -> (1, 1) -> (1, 2)

The time complexity of the recursive solution is exponential. 
We are using Dynamic Programming memorization approach for linear time complexity.
*/

// Link --> https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/

public class GridTravellerDP {

    public static long gridTravellerIterative(int row, int column) {

        // using a dp-array for memorization:
        long dp[][] = new long[row][column];

        // initializing dp array:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                dp[i][j] = 1;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[row - 1][column - 1];
    }

    public static long gridTravellerRecursive(int row, int column, long dp[][]) {

        // modified recursive base case:
        if (row == 1 || column == 1) {
            return dp[row][column] = 1;
        }

        // Only calling the recursive function when the route is not traced.
        // dp[row][column] = 0, means the route is untraced.
        if (dp[row][column] == 0) {
            dp[row][column] = gridTravellerRecursive(row - 1, column, dp) + gridTravellerRecursive(row, column - 1, dp);
        }

        return dp[row][column];
    }

    public static void main(String[] args) {

        System.out.println("Iterative Approach");

        System.out.println(gridTravellerIterative(1, 1));
        System.out.println(gridTravellerIterative(2, 3));
        System.out.println(gridTravellerIterative(3, 2));
        System.out.println(gridTravellerIterative(18, 18));

        System.out.println("------------------");
        System.out.println("Recursive Approach");

        int row = 18, column = 18;
        // using a dp-array for memorization:
        long dp[][] = new long[row + 1][column + 1];

        // initializing dp array:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                dp[i][j] = 0;
            }
        }
        System.out.println(gridTravellerRecursive(row, column, dp));
    }
}

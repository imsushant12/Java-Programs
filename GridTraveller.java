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

The time complexity of this recursive solution is exponential. 
We should use Dynamic Programming for linear time complexity.
*/

// Link --> https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/



public class GridTraveller {

    public static int gridTraveller(int row, int column) {
        
        // base cases:
        if(row == 1 && column == 1) {
            return 1;
        }
        if(row == 0 || column == 0) {
            return 0;
        }

        return (gridTraveller(row-1, column) + gridTraveller(row, column - 1));
    }

    public static void main(String[] args) {

        System.out.println(gridTraveller(1, 1));
        System.out.println(gridTraveller(2, 3));
        System.out.println(gridTraveller(3, 2));
        System.out.println(gridTraveller(18, 18));

    }
}


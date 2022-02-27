/*
Problem Statement:
------------------
Given n number of sorted files, the task is to find the minimum computations done to reach the Optimal Merge Pattern. 
When two or more sorted files are to be merged altogether to form a single file, the minimum computations are done to reach this file are known as Optimal Merge Pattern.

Question Link: https://www.geeksforgeeks.org/optimal-file-merge-patterns/
*/

import java.util.PriorityQueue;

public class OptimalFileMerge {
    static int  minComputation(int n, int files[]) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        // Initially inserting all the available files in the min head (priority queue).
        for (int i = 0; i < files.length; i++) {
            pq.add(files[i]);
        }
        
        int result =0;

        while(pq.size() > 1) {
            int firstSmallest = pq.poll();
            int secondSmallest = pq.poll();

            // Adding the merged file time in the min heap and
            // adding the merged computation to our answer.
            pq.add(firstSmallest + secondSmallest);
            result += (firstSmallest + secondSmallest);
        }

        return result;
    }
    public static void main(String[] args) {
        int size = 6;

        int files[] = new int[] { 2, 3, 4, 5, 6, 7 };

        System.out.println("Minimum number of computations needed = "
                + minComputation(size, files));
    }
}

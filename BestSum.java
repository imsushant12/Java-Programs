
/*
Problem Statement:
------------------
Write a function `bestSum(targetSum, numbers)` that takes in a targetSum and an array of numbers as arguments.

The function should return an array containing the shortest combination of numbers that add up to exactly the targetSum

If there is a tie for the shortest combination, you may return any one of the shortest.

Examples:
---------
bestSum(7, [2, 3])       --> [2, 2, 3]
bestSum(7, [2, 4])       --> null
bestSum(8, [2, 3, 5])    --> [3, 5]
bestSum(7, [5, 3, 4, 7]) --> [7]
bestSum(300, [7, 14])    --> null
*/

import java.util.*;

public class BestSum {

    public static Object bestSum(int targetSum, Integer numbers[], ArrayList<Integer> result) {
        // Base Cases:
        if (targetSum == 0) {
            // If the targetSum becomes 0, we have found a result. So, returning an empty array.
            return (new ArrayList<Integer>());
            // NOTE: The function call will add the result to this array.
        }
        if (targetSum < 0) {
            // If the targetSum becomes -ve, the path certainly does not contain our answer. 
            // So, returning "null".
            return null;
        }

        for (int i = 0; i < numbers.length; i++) {
            int remainingSum = targetSum - numbers[i];

            // If the function has not returned null, 
            // the current element (i.e. numbers[i]), may lead to our answer.
            // So, adding the current element to the result array.
            if (bestSum(remainingSum, numbers, result) != null) {
                result.add(numbers[i]);
                return result;
            }
        }
        // backtracking, returning null
        return null;
    }

    // We can also use a variable to maintain the least sized array.
    public static void main(String[] args) {
        int targetSum = 7;
        Integer numbers[] = { 5, 3, 4, 7 };
        ArrayList<Integer> result = new ArrayList<>();
  
        // Sorting the array in descending order so that 
        // least numbers will be required to form the targetSum.
        Arrays.sort(numbers, Collections.reverseOrder());
         
        System.out.println(bestSum(targetSum, numbers, result));
    }
}

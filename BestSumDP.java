
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

public class BestSumDP {
    public static Object bestSumDP(int targetSum, Integer numbers[], ArrayList<Integer> result, Map<Integer, ArrayList<Integer>> dp) {

        // Base Cases:
        if (dp.containsKey(targetSum)) {
            return dp.get(targetSum);
        }
        if (targetSum == 0) {
            // If the targetSum becomes 0, we have found a result. So, returning an empty
            // array.
            return (new ArrayList<Integer>());
        }
        if (targetSum < 0) {
            // If the targetSum becomes -ve, the path certainly does not contain our answer.
            return null;
        }

        for (int i = 0; i < numbers.length; i++) {
            int remainingSum = targetSum - numbers[i];

            // If the function has not returned null,
            // the current element (i.e. numbers[i]), may lead to our answer.
            if (bestSumDP(remainingSum, numbers, result, dp) != null) {
                result.add(numbers[i]);
                dp.put(targetSum, result);
                return result;
            }
        }
        // backtracking, returning null
        dp.put(targetSum, null);
        return null;
    }

    public static void main(String[] args) {
        int targetSum = 300;
        Integer numbers[] = { 2,10 };

        Map<Integer, ArrayList<Integer>> dp = new HashMap<>();
        // Using the result array for the thread safety purpose only...
        ArrayList<Integer> result = new ArrayList<>();

        // Sorting the array in descending order so that 
        // least numbers will be required to form the targetSum.
        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println(bestSumDP(targetSum, numbers, result, dp));
    }
}

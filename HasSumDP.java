/*
Problem Statement:
------------------
Write a function `howSum(targetSum, numbers)` that takes in a targetSum and an array of numbers as arguments.

The function should return an array containing any combination of elements that add up to exactly the targetSum. If there is no combination that adds up to the targetSum, then return null.

If there are multiple combinations possible, you may return any single one.

Examples:
---------
hasSum(7, [2, 3])       --> [3, 2, 2]
hasSum(7, [2, 4])       --> [4, 3]
hasSum(8, [2, 3, 5])    --> null
hasSum(7, [5, 3, 4, 7]) --> [2, 2, 2, 2]
hasSum(300, [7, 14])    --> null
*/

import java.util.*;

public class HasSumDP {
    public static Object hasSumDP(int targetSum, int numbers[], ArrayList<Integer> result, Map<Integer, ArrayList<Integer>> dp) {

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
            if (hasSumDP(remainingSum, numbers, result, dp) != null) {
                result.add(numbers[i]);
                dp.put(targetSum, result);
                return result;
            }
        }
        // backtracking, returning null
        dp.put(targetSum, null);
        return null;
    }

    // We can also use a variable to maintain the least sized array.
    public static void main(String[] args) {
        int targetSum = 300;
        int numbers[] = { 7, 14 };

        Map<Integer, ArrayList<Integer>> dp = new HashMap<>();
        // Using the result array for the thread safety purpose only..
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println(hasSumDP(targetSum, numbers, result, dp));
    }
}


/*
// Thread unsafe code without using ArrayList.
// -------------------------------------------

public static ArrayList hasSumDP(int targetSum, int numbers[], Map<Integer, ArrayList<Integer>> dp) {

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
            ArrayList<Integer> answer = hasSumDP(remainingSum, numbers, dp);
            if (answer != null) {
                answer.add(numbers[i]);
                dp.put(targetSum, answer);
                return answer;
            }
        }
        // backtracking, returning null
        dp.put(targetSum, null);
        return null;
    }
*/
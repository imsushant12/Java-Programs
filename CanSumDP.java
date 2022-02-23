/*
Problem Statement:
------------------
Write a function `canSum(targetSum, numbers)` that takes in a targetSum and an array of numbers as arguments.

The function should return a boolean indicating whether or not it is possible to generate the targetSum using numbers from the array.

You may use an element of the array as many times as needed.
You may assume that all input numbers are non-negative.

Examples:
---------
canSum(7, [2, 3])       --> True
canSum(7, [2, 4])       --> False
canSum(8, [2, 3, 5])    --> True
canSum(7, [5, 3, 4, 7]) --> True
canSum(300, [7, 14])    --> False
*/

import java.util.*;

public class CanSumDP {
    public static boolean canSumDP(int targetSum, int numbers[], Map<Integer, Boolean> dp) {
        // base cases:
        if (dp.containsKey(targetSum)) {
            return dp.get(targetSum);
        }

        if (targetSum == 0) {
            return true;
        }

        if (targetSum < 0) {
            return false;
        }

        for (int i = 0; i < numbers.length; i++) {
            int remainingSum = targetSum - numbers[i];

            if (canSumDP(remainingSum, numbers, dp) == true) {
                dp.put(targetSum, true);
                return true;
            }
        }
        dp.put(targetSum, false);
        return false;
    }

    public static void main(String[] args) {
        int targetSum = 300;
        int[] numbers = { 7, 14 };

        Map<Integer, Boolean> dp = new HashMap<>();

        System.out.println(canSumDP(targetSum, numbers, dp));
    }
}

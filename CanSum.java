/*
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

public class CanSum {

    public static boolean canSumRecursive(int targetSum, int numbers[]) {
        // base cases:
        if (targetSum == 0) {
            return true;
        }
        if (targetSum < 0) {
            return false;
        }

        for (int i = 0; i < numbers.length; i++) {
            int remainingSum = targetSum - numbers[i];

            if (canSumRecursive(remainingSum, numbers) == true) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int targetSum = 300;
        int[] numbers = { 7, 14 };
        System.out.println(canSumRecursive(targetSum, numbers));
    }
}

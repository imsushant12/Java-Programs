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

import java.util.ArrayList;

public class HasSum {

    public static Object hasSum(int targetSum, int numbers[], ArrayList<Integer> result) {

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
            if (hasSum(remainingSum, numbers, result) != null) {
                result.add(numbers[i]);
                return result;
            }
        }
        // backtracking, returning null
        return null;
    }

    public static void main(String[] args) {
        int targetSum = 300;
        int numbers[] = { 7, 14 };

        // The result array will contain the elements that sums up to targetSum.
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println(hasSum(targetSum, numbers, result));
    }
}


/*
// Using only one ArrayList (Thread Unsafe)
// ----------------------------------------

public static ArrayList hasSum(int targetSum, int numbers[]) {
    if (targetSum == 0)
        return (new ArrayList<Integer>());
    
    if (targetSum < 0) 
        return null;

    for (int i = 0; i < numbers.length; i++) {
        int remainingSum = targetSum - numbers[i];

        ArrayList<Integer> answer = hasSum(remainingSum, numbers);

        if (answer != null) {
            answer.add(numbers[i]);
            return (answer);
        }
    }
    return null;
}

public static void main(String[] args) {
    int targetSum = 8;
    int numbers[] = { 2, 3, 5};
    
    System.out.println(hasSum(targetSum, numbers));
}
*/
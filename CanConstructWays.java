/*
Problem Statement:
------------------
Write a function `canConstruct(target, wordBank)` that accepts a target string and an array of strings.

The function should return the number of ways that the `target` can be constructed by concatenating elements of the `wordBank` array.

You may reuse elements of `worldBank` as many times as needed.

Examples:
---------
canConstruct('abcdef', ['ab', 'abc', 'cd', 'def', 'abcd'])  -> 1

canConstruct('skateboard', ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar'])  -> 0

canConstruct('purple', ['purp', 'p', 'ur', 'le', 'purpl'])  -> 2
*/

import java.util.*;

public class CanConstructWays {
    public static Integer canConstructWays(String target, String wordBank[], Map<String, Integer> dp) {

        // Base cases:
        if (dp.containsKey(target)) {
            return dp.get(target);
        }
        if (target == "") {
            return 1;
        }

        int totalWays = 0;

        for (int i = 0; i < wordBank.length; i++) {
            // If the current word is present as prefix
            if (target.indexOf(wordBank[i]) == 0) {
                String remainingString = target.substring(wordBank[i].length());

                int ways = canConstructWays(remainingString, wordBank, dp);

                totalWays += ways;
            }
        }
        dp.put(target, totalWays);
        return totalWays;
    }

    public static void main(String[] args) {
        String target = "purple";
        String wordBank[] = { "pur", "p", "ur", "le", "purpl" };

        // Initializing dp array to memorize the calls.
        Map<String, Integer> dp = new HashMap<>();

        System.out.println(canConstructWays(target, wordBank, dp));
    }
}

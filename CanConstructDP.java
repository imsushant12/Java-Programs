/*
Problem Statement:
------------------
Write a function `canConstruct(target, wordBank)` that accepts a target string and an array of strings.

The function should return a boolean indicating whether or not the `target` can be constructed by concatenating elements of the `wordBank` array.

You may reuse elements of `worldBank` as many times as needed.

Examples:
---------
canConstruct('abcdef', ['ab', 'abc', 'cd', 'def', 'abcd'])  -> True

canConstruct('skateboard', ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar'])  -> False

canConstruct('eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef', ['e', 'ee', 'eee', 'eeee', 'eeeee', 'eeeeee'])  -> False
*/

import java.util.*;

public class CanConstructDP {
    public static boolean canConstructDP(String target, String wordBank[], Map<String, Boolean> dp) {

        // Base cases:
        if (dp.containsKey(target)) {
            return dp.get(target);
        }
        if (target == "") {
            return true;
        }

        for (int i = 0; i < wordBank.length; i++) {
            // If the current word is present as prefix
            if (target.indexOf(wordBank[i]) == 0) {
                String remainingString = target.substring(wordBank[i].length());

                if (canConstructDP(remainingString, wordBank, dp) == true) {
                    dp.put(target, true);
                    return true;
                }
            }
        }
        dp.put(target, false);
        return false;
    }

    public static void main(String[] args) {
        String target = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef";
        String wordBank[] = { "e", "ee", "eee", "eeee", "eeeee", "eeeeee" };

        // Initializing dp array to memorize the calls.
        Map<String, Boolean> dp = new HashMap<>();

        System.out.println(canConstructDP(target, wordBank, dp));
    }

}

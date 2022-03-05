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

public class CanConstruct {

    public static boolean canConstruct(String target, String wordBank[]) {

        // Base case:
        if (target == "") {
            return true;
        }

        for (int i = 0; i < wordBank.length; i++) {
            // If the current word is present as prefix
            if (target.indexOf(wordBank[i]) == 0) {
                String remainingString = target.substring(wordBank[i].length());

                if (canConstruct(remainingString, wordBank) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String target = "abcdef";
        String wordBank[] = { "ab", "abc", "cd", "def", "abcd" };

        System.out.println(canConstruct(target, wordBank));
    }
}

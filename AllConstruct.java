/*
Problem Statement:
------------------
Write a function `allConstruct(target, wordBank)` that accepts a target string and an array of strings.

The function should return a 2D array containing all the ways that the `target` can be constructed by concatenating elements of the `wordBank` array. Each element of the 2D array should represent oe combination that constructs the `target`

You may reuse elements of `worldBank` as many times as needed.

Examples:
---------
allConstruct('abcdef', ['ab', 'abc', 'cd', 'def', 'abcd', 'ef', 'c'])  -> 
[
    ['ab', 'cd', 'ef'],
    ['ab', 'c', 'def'],
    ['abc', 'def'],
    ['abcd', 'ef']
] 

allConstruct('purple', ['purp', 'p', 'ur', 'le', 'purpl'])  -> 
[ 
    [purp, le], 
    [p, ur, p, le] 
]
*/

import java.util.*;

public class AllConstruct {
    public static ArrayList<ArrayList<String>> allConstruct(String target, String wordBank[]) {
        if (target == "") {
            return (new ArrayList<ArrayList<String>>());
        }

        ArrayList<ArrayList<String>> answer = new ArrayList<>();

        for (int i = 0; i < wordBank.length; i++) {
            if (target.indexOf(wordBank[i]) == 0) {
                // String currentWord = wordBank[i];

                String remainingString = target.substring(wordBank[i].length());

                ArrayList<ArrayList<String>> currentResult = allConstruct(remainingString, wordBank);

                ArrayList<String> arr = new ArrayList<>();
                arr.add(wordBank[i]);

                if (currentResult.size() == 0) {
                    currentResult.add(arr);
                } else {
                    currentResult.forEach((ele) -> {
                        ele.addAll(arr);
                    });
                }

                answer.addAll(currentResult);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String target = "purple";
        String wordBank[] = { "pur", "p", "ur", "le", "purpl" };

        System.out.println(allConstruct(target, wordBank));

    }
}

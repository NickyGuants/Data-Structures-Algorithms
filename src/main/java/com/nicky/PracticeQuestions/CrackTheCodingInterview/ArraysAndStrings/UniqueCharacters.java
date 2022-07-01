package com.nicky.PracticeQuestions.CrackTheCodingInterview.ArraysAndStrings;

/*
Implement an algorithm to determine if a string has all unique characters.
What if you could not use additional data structures?
*/

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    //Implementation 1: Using additional data structure i.e. Hashmap
    //Time complexity = O(n), because in the worst case, we are looping through the whole string
    //Space complexity = O(n), because we need a hashmap of the same length as the string
    // the worst case scenario ie, if all characters are unique.
    public static boolean isUnique(String str){
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int i=0; i<str.length(); i++){
            charFrequency.put(str.charAt(i), charFrequency.getOrDefault(str.charAt(i), 0)+1);
        }

        for (int i=0; i<str.length(); i++){
            if (charFrequency.get(str.charAt(i)) > 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        String str = "ww";
        System.out.println(isUnique(str));
    }
}

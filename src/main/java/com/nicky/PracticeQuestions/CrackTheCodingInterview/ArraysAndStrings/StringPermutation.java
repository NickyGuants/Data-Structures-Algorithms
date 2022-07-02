package com.nicky.PracticeQuestions.CrackTheCodingInterview.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

/*
Check permutation: Given two strings, write a method to decide if one is a permutation of the other.
 */

public class StringPermutation {
    //Approach using a hash table to store the characters in one string and their frequency of occurrence.
    //I chose this approach because I am trying to check if the two strings have the same set of characters.
    //Therefore, with a hashmap, I can quickly check if a character in string a appears in string b and so on.
    //Time complexity: O(n), because we're only going over the string once, in the worst case scenario i.e. O(n) + O(n)
    //which translates to O(n)
    //Space complexity is O(n), because we're storing the values of the one string in a hashmap that in the worst case will
    //be the same length as the length of the string itself.
    public static boolean checkPermutation(String a, String b){
        Map<Character, Integer> charFrequency = new HashMap<>();

        if (a.length() != b.length()){
            return false;
        }

        for (char ch: b.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0)+1);
        }
        System.out.println(charFrequency);

        for(char ch: a.toCharArray()){
            if (charFrequency.containsKey(ch)){
                charFrequency.put(ch, charFrequency.get(ch)-1);
                if (charFrequency.get(ch)<1){
                    charFrequency.remove(ch);
                }
            }else
                return false;
        }
        if (charFrequency.size()> 0){
            return false;
        }
        return true;
    }

    public static void main(String [] args){
        System.out.println(checkPermutation("babc", "abbc"));
    }
}
